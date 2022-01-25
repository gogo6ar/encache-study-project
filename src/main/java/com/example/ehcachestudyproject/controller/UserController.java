package com.example.ehcachestudyproject.controller;

import com.example.ehcachestudyproject.model.dto.UserDTO;
import com.example.ehcachestudyproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
  private final UserService userService;

  @GetMapping("/{userId}")
  public ResponseEntity<UserDTO> findById(@PathVariable Long userId) {
    return ResponseEntity.ok(userService.findById(userId));
  }

  @GetMapping
  public ResponseEntity<List<UserDTO>> findAll() {
    return ResponseEntity.ok(userService.findAll());
  }
}
