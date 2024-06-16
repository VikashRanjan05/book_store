package com.core.bookstore.service.user;

import com.core.bookstore.controller.user.dto.CreateUserRequest;
import com.core.bookstore.dao.model.User;
import com.core.bookstore.dao.repository.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

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
}
