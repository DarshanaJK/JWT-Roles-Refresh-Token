package com.darshana.springsecurity.services.Impl;

import com.darshana.springsecurity.dto.SignUpRequest;
import com.darshana.springsecurity.entity.Role;
import com.darshana.springsecurity.entity.User;
import com.darshana.springsecurity.repository.UserRepository;
import com.darshana.springsecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public User signup(SignUpRequest signUpRequest) {

        User user = new User();

        user.setEmail(signUpRequest.getEmail());
        user.setFirstname(signUpRequest.getFirstName());
        user.setSecondname(signUpRequest.getLastName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

        return userRepository.save(user);

    }


}
