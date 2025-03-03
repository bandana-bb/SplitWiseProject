package dev.bandana.splitwiseproject.Dtos;


import dev.bandana.splitwiseproject.Models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDto {
    List<Expense> expenses;
}
