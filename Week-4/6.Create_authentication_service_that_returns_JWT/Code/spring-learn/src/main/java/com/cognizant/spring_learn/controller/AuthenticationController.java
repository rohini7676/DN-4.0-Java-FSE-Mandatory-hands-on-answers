package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private final JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public Map<String, String> generateToken(Authentication authentication) {
        LOGGER.info("Start - generateToken");
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        LOGGER.info("End - generateToken");
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
