package com.rawtech.Spring.Security.Tutorial.user.repositories;

import com.rawtech.Spring.Security.Tutorial.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
