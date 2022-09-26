package com.example.firstapp.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "USER_DETAILS")
@Data
@Entity
public class UserDetails {

    @Id
    @GeneratedValue
    private  long id;
    private  String Name;
    private  String Mobileno;
    private  String UserEmail;
    private  String password;

}
