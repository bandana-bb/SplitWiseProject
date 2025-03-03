package dev.bandana.splitwiseproject.Strategies;

import dev.bandana.splitwiseproject.Models.Expense;

import java.util.ArrayList;
import java.util.List;

public class BruteForceSettleUpStrategy implements SettleUpStrategy{
    @Override
    public List<Expense> settleUp(List<Expense> expenses) {
        return new ArrayList<>();
    }
}
