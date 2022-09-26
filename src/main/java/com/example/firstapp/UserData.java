package com.example.firstapp;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class UserData {

    private  long id;

    @NotBlank(message = "name not be nulls")
    private  String Name;

    @Min(10)
    @NotBlank(message = "Please Enter Mobile No")
    private  String Mobileno;

    @NotBlank(message = "email not be null")
    private  String UserEmail;

    @NotBlank(message = "password not be null")
    private  String password;
}
