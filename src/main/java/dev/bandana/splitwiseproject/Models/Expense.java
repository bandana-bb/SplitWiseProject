package dev.bandana.splitwiseproject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="expenses")
public class Expense extends BaseModel {
          private String Description;
          private double Amount;
          @OneToMany(mappedBy = "expense")
          private List<ExpenseUser> expenseUserList;
          private ExpenseType expenseType;
}
