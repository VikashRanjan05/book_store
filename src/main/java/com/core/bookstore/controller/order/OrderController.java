package com.core.bookstore.controller.order;

import com.core.bookstore.service.order.OrderService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping(value = "/v1/order/create")
    public ResponseEntity<String> createUser() {

        orderService.createOrder();

        return ResponseEntity.ok().body("Order has been created!");
    }

    @GetMapping(value = "/v1/order/{name}")
    public ResponseEntity<String> getOrderDetails(@PathVariable String name) {
        orderService.getOrderDetails(name);

        return ResponseEntity.ok().body("Something went wrong");
    }
}
