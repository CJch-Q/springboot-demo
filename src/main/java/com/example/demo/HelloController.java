package com.example.demo;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping({"/", "/health"})
    public Map<String, Object> health() {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("service", "springboot-demo");
        payload.put("status", "UP");
        payload.put("timestamp", Instant.now().toString());
        return payload;
    }
}
