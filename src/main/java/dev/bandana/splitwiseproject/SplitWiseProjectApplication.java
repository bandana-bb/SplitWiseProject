package dev.bandana.splitwiseproject;

import dev.bandana.splitwiseproject.Commands.CommandExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitWiseProjectApplication {

    private static CommandExecutor commandExecutor;

    public SplitWiseProjectApplication(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }
    public static void main(String[] args) {
        SpringApplication.run(SplitWiseProjectApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.next();
            commandExecutor.execute(line);

        }
    }


}
