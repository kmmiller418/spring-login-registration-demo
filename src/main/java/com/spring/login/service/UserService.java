package com.spring.login.service;

import com.spring.login.model.User;
import com.spring.login.web.UserRegistration;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistration registration);
}
