package dev.bandana.splitwiseproject.Commands;

import dev.bandana.splitwiseproject.Controllers.UserController;
import dev.bandana.splitwiseproject.Dtos.RegisterRequestDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisterUserCommand implements Command {

    private UserController userController;

    public RegisterUserCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean matching(String input) {
        List<String> words = List.of(input.split(" "));
        return words.size()==4 && words.get(0).equals("Register");
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));
        String name=words.get(0);
        String phoneNumber=words.get(1);
        String password=words.get(2);

        RegisterRequestDto registerRequestDto=new RegisterRequestDto();
        registerRequestDto.setName(name);
        registerRequestDto.setPhoneNumber(phoneNumber);
        registerRequestDto.setPassword(password);

        userController.registerUser(registerRequestDto);
    }
}
