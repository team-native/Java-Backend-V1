package com.teamnative.backend.domain.sample.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {

    @GetMapping("/public/ping")
    public Map<String, String> publicPing() {
        return Map.of("message", "public pong");
    }

    @GetMapping("/private/ping")
    public Map<String, String> privatePing() {
        return Map.of("message", "private pong");
    }
}
