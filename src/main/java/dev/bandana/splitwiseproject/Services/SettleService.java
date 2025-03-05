package dev.bandana.splitwiseproject.Services;

import dev.bandana.splitwiseproject.Models.Expense;
import dev.bandana.splitwiseproject.Models.ExpenseUser;
import dev.bandana.splitwiseproject.Models.User;
import dev.bandana.splitwiseproject.Repository.ExpenseUserRepository;
import dev.bandana.splitwiseproject.Repository.UserRepository;
import dev.bandana.splitwiseproject.Strategies.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SettleService {

    private UserRepository UserRepository;
    private ExpenseUserRepository expenseUserRepository;
    private SettleUpStrategy settleUpStrategy;

    public SettleService(UserRepository UserRepository,ExpenseUserRepository expenseUserRepository,SettleUpStrategy settleUpStrategy) {
        this.UserRepository = UserRepository;
        this.expenseUserRepository = expenseUserRepository;
        this.settleUpStrategy = settleUpStrategy;
    }
    public List<Expense> settleUpUser(Long userId){
        Optional<User> opUser = UserRepository.findById(userId);
        if(opUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        User user = opUser.get();
        //find all the expenses for the given user
        List<ExpenseUser> expenseUsers = expenseUserRepository.findByUser(user);

        Set<Expense> expensesettleUp= new HashSet<>();

        for(ExpenseUser expenseUser : expenseUsers){
            expensesettleUp.add(expenseUser .getExpense());
        }

        List<Expense> settleUpExpenses=settleUpStrategy.settleUp(expensesettleUp.stream().toList());

        //Instead of returning all the transactions to the user , we can only return the transactions
        //in which user has to pay something or get something.

        List<Expense> finalSettleUpExpenses = new ArrayList<>();
        for(Expense expense : settleUpExpenses){
            for(ExpenseUser expenseUser : expense.getExpenseUserList()){
                if(expenseUser.getUser().equals(user)){
                    finalSettleUpExpenses.add(expense);
                    break;
                }
            }

        }
        return finalSettleUpExpenses;
        }
    public List<Expense> settleUpGroup(Long groupId){
        return null;
    }
}
