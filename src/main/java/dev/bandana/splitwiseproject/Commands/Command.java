package dev.bandana.splitwiseproject.Commands;

public interface Command {

    boolean matching (String input);
    void execute (String input);
}
