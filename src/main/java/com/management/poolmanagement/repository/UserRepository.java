package com.management.poolmanagement.repository;

import com.management.poolmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUsersById(Long id);
}
