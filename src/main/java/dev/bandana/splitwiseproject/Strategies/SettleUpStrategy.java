package dev.bandana.splitwiseproject.Strategies;

import dev.bandana.splitwiseproject.Models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses );
}
