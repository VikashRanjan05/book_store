package com.core.bookstore.dao.repository;

import com.core.bookstore.dao.model.User;
import jakarta.annotation.Resource;
import org.springframework.data.repository.CrudRepository;

@Resource
public interface UserRepository extends CrudRepository<User, Long> {
}
