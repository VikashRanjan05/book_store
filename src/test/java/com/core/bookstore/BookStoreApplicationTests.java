package com.core.bookstore;

import com.core.bookstore.controller.HealthCheckController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookStoreApplicationTests {

    @Resource
    HealthCheckController healthCheckController;

    @Test
    void testAdd() {
        assertEquals(6, healthCheckController.add(2, 3));
    }

}
