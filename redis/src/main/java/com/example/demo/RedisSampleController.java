package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisSampleController {
	@GetMapping("/getSessionId")
    public String getSessionId(HttpSession session) {
		System.out.println("redis 8080 session ID 값"+session.getId());
        return session.getId();
    }

}
