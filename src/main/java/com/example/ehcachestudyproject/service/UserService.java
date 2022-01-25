package com.example.ehcachestudyproject.service;

import com.example.ehcachestudyproject.model.dto.UserDTO;

import java.util.List;

public interface UserService {
  List<UserDTO> findAll();

  UserDTO findById(Long id);
}
