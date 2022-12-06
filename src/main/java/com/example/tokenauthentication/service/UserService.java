package com.example.tokenauthentication.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String login(String username, String password) {
        return "토큰이 발행 되었습니다";
    }
}

