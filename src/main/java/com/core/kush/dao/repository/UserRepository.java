package com.core.kush.dao.repository;

import com.core.kush.dao.model.User;
import jakarta.annotation.Resource;
import org.springframework.data.repository.CrudRepository;

@Resource
public interface UserRepository extends CrudRepository<User, Long> {
}
