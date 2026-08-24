package com.teamnative.backend.domain.auth.controller;

import com.teamnative.backend.domain.auth.dto.LoginRequest;
import com.teamnative.backend.domain.auth.dto.LoginResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        return new LoginResponse(
                "replace-with-jwt-token",
                "Bearer",
                request.username()
        );
    }
}
