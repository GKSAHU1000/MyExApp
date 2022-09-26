package com.example.firstapp.service;

import com.example.firstapp.UserData;
import com.example.firstapp.entity.UserDetails;
import com.example.firstapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService  {

    @Autowired
    public UserRepo userRepo ;

    public UserDetails AddUserData(UserData userData){
        UserDetails userDetails = new UserDetails();

        userDetails.setName(userData.getName());
        userDetails.setMobileno(userData.getMobileno());
        userDetails.setUserEmail(userData.getUserEmail());
        userDetails.setPassword(userData.getPassword());
        return  userRepo.save(userDetails);
    }
}
