package dev.bandana.splitwiseproject.Dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequestDto {
    private String name;
    private String phoneNumber;
    private String password;
}
