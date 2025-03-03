package dev.bandana.splitwiseproject.Models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="usersSplit")
public class User extends BaseModel{
    private String Name;
    private String phoneNumber;
    private String Password;

}
