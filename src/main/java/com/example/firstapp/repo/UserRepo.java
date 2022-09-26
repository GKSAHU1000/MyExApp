package com.example.firstapp.repo;

import com.example.firstapp.UserData;
import com.example.firstapp.entity.UserDetails;
import com.example.firstapp.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDetails, Integer> {




}
