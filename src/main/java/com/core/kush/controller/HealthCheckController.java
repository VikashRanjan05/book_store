package com.core.kush.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
public class HealthCheckController {


    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public HealthCheckResponse getStatus() {
        return new HealthCheckResponse("Vasitum core is running");
    }

    @GetMapping(value = "/healthcheck", produces = APPLICATION_JSON_VALUE)
    public HealthCheckResponse getResponse() {
        return new HealthCheckResponse("Vasitum core is running");
    }

    public int add(int a, int b) {
        return a + b;
    }


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HealthCheckResponse {
        private String status;
    }
}
