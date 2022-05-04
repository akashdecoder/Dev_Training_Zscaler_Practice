package com.example.railways.service;


import com.example.railways.models.UserDetails;

public interface UserService {
    // UserDetails fetchUserByUserId(int uId) ;

    UserDetails createUser(UserDetails userDetails);

    UserDetails fetchByEmail(String emailId);

    UserDetails fetchById(int uId) ;
}
