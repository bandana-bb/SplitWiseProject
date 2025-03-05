package dev.bandana.splitwiseproject.Controllers;

import dev.bandana.splitwiseproject.Dtos.RegisterRequestDto;
import dev.bandana.splitwiseproject.Dtos.RegisterUserResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public RegisterUserResponseDto registerUser(RegisterRequestDto registerRequestDto) {
        RegisterUserResponseDto registerUserResponseDto = new RegisterUserResponseDto();
        return null;
    }
}
