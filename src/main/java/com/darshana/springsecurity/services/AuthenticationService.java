package com.darshana.springsecurity.services;

import com.darshana.springsecurity.dto.JwtAuthenticationResponse;
import com.darshana.springsecurity.dto.SignUpRequest;
import com.darshana.springsecurity.dto.SigninRequest;
import com.darshana.springsecurity.entity.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);
}
