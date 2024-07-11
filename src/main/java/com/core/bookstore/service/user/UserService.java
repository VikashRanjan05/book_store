package com.core.bookstore.service.user;

import com.core.bookstore.controller.user.dto.CreateUserRequest;
import com.core.bookstore.dao.model.Order;
import com.core.bookstore.dao.model.User;
import com.core.bookstore.dao.repository.OrderRepository;
import com.core.bookstore.dao.repository.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public void createUser(CreateUserRequest createUserRequest) {
        User user = User.builder()
                .userName(createUserRequest.getUserName())
                .email(createUserRequest.getEmail())
                .build();

        userRepository.save(user);
    }

    public void getUserOrder(String email) {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isEmpty()) {
            throw new IllegalArgumentException("no User Found!");
        }

        System.out.println(user.get());
    }
}
