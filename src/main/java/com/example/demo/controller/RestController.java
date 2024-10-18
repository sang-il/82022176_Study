package com.example.restapiexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/user")
    public Map<String, String> getUser() {
        // 사번(UserId)를 리턴하는 간단한 API
        Map<String, String> response = new HashMap<>();
        response.put("UserId", "82022176"); // 예시 사번 리턴
        return response;
    }
}
