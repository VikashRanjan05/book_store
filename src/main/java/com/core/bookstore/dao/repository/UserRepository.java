package com.core.bookstore.dao.repository;

import com.core.bookstore.dao.model.User;
import jakarta.annotation.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
