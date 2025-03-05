package dev.bandana.splitwiseproject.Commands;

import dev.bandana.splitwiseproject.Controllers.Settleupcontroller;
import dev.bandana.splitwiseproject.Dtos.SettleUpRequestDto;
import org.aspectj.bridge.ICommand;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleUpUserCommand implements Command {

    private Settleupcontroller settleupcontroller;
    public SettleUpUserCommand(Settleupcontroller settleupcontroller) {
        this.settleupcontroller = settleupcontroller;
    }

    @Override
    public boolean matching(String input) {

        List<String> ls= List.of(input.split(" "));

        return ls.size()==2 && ls.get(0).equalsIgnoreCase("SettleUp");
    }

    @Override
    public void execute(String input) {
        List<String> ls= List.of(input.split(" "));
        Long userId = Long.parseLong(ls.get(0));
        SettleUpRequestDto settleUpRequestDto=new SettleUpRequestDto();
        settleUpRequestDto.setUserId(userId);
        settleupcontroller.settleUpUser(settleUpRequestDto);
    }
}
