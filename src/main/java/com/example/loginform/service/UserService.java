package com.example.loginform.service;

import com.example.loginform.dto.UserRegistrationDto;
import com.example.loginform.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
        User save(UserRegistrationDto registrationDTO);

}
