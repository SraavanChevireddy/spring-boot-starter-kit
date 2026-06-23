package com.sraavan.starter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

/**
 * A sample REST endpoint demonstrating request handling and JSON responses.
 */
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello(@RequestParam(defaultValue = "world") String name) {
        return Map.of(
                "message", "Hello, " + name + "!",
                "timestamp", Instant.now().toString()
        );
    }
}
