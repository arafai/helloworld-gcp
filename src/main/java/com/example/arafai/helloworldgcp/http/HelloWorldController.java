package com.example.arafai.helloworldgcp.http;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public Mono<String> root() {
        return Mono.just(appName);
    }

}
