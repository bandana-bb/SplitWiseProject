package dev.bandana.splitwiseproject.Commands;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandExecutor {

    private RegisterUserCommand registerUserCommand;
    private SettleUpUserCommand settleUpUserCommand;

    public CommandExecutor(RegisterUserCommand registerUserCommand, SettleUpUserCommand settleUpUserCommand) {
        this.registerUserCommand = registerUserCommand;
        this.settleUpUserCommand = settleUpUserCommand;

        commands.add(registerUserCommand);
        commands.add(settleUpUserCommand);

    }

    public void add(Command command) {
        commands.add(command);
    }

    public void remove(Command command) {
        commands.remove(command);
    }

    public void execute(String input) {
        for (Command command : commands) {
            if(command.matching(input)) {
                command.execute(input);
                break;
            }

        }
    }
    private List<Command> commands;

}
