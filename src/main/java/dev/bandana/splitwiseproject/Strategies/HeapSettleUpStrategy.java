package dev.bandana.splitwiseproject.Strategies;

import dev.bandana.splitwiseproject.Models.Expense;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HeapSettleUpStrategy implements SettleUpStrategy{

    @Override
    public List<Expense> settleUp(List<Expense> expenses) {

        //TODO: Implement max and min heap and refer the algorithm in the notes
        return new ArrayList<>();
    }
}
