package com.core.bookstore.controller.user;

import com.core.bookstore.controller.user.dto.CreateUserRequest;
import com.core.bookstore.service.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/v1/user")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest createUserRequest) {

        userService.createUser(createUserRequest);

        return ResponseEntity.ok().body("User has been created!");
    }
}
