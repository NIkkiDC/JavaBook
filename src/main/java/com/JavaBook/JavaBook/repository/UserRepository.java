package com.JavaBook.JavaBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // register


    boolean existsByEmailAddress(String emailAddress);

    // login
    User findUserByEmailAddress(String emailAddress);
}
