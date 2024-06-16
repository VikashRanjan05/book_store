package com.core.kush.service.user;

import com.core.kush.controller.user.dto.CreateUserRequest;
import com.core.kush.dao.model.User;
import com.core.kush.dao.repository.UserRepository;
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
