package com.lighthouseshavedice.home.repositories;

import com.lighthouseshavedice.home.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findUserById(Long id);

    List<User> findByUsernameContaining(String username);
}
