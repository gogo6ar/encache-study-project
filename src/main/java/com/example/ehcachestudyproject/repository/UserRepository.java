package com.example.ehcachestudyproject.repository;

import com.example.ehcachestudyproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}