package dev.bandana.splitwiseproject.Repository;

import dev.bandana.splitwiseproject.Models.Expense;
import dev.bandana.splitwiseproject.Models.ExpenseUser;
import dev.bandana.splitwiseproject.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
    List<ExpenseUser> findByUser(User user);
    //select * from expense_user where user_id=given id;
}
