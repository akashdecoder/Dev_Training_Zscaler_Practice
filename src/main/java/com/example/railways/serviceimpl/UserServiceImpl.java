package com.example.railways.serviceimpl;

import com.example.railways.models.UserDetails;
import com.example.railways.repository.UserRepository;
import com.example.railways.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    // @Override
    // public UserDetails fetchUserByUserId(int uId) {
    //     return userRepository.fetchByUserID(uId);
    // }

    @Override
    public UserDetails createUser(UserDetails userDetails) {
        userDetails.setuPassword(encoder.encode(userDetails.getuPassword()));
        return userRepository.save(userDetails);
    }

    @Override
    public UserDetails fetchById(int uId) {
        return userRepository.fetchById(uId);
    }

    @Override
    public UserDetails fetchByEmail(String emailId) {
        return userRepository.fetchByEmail(emailId);
    }
}
