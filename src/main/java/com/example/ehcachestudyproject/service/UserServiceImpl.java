package com.example.ehcachestudyproject.service;

import com.example.ehcachestudyproject.model.User;
import com.example.ehcachestudyproject.model.dto.Mapper;
import com.example.ehcachestudyproject.model.dto.UserDTO;
import com.example.ehcachestudyproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

  private final UserRepository userRepository;
  private final Mapper<User, UserDTO> userToDTOMapper;

  @Override
  @Cacheable("user") // Add this
  @Transactional(readOnly = true)
  public List<UserDTO> findAll() {
    return userToDTOMapper.mapList(userRepository.findAll());
  }

  @Override
  @Transactional(readOnly = true)
  public UserDTO findById(Long id) {
    return userToDTOMapper
            .map(userRepository
                         .findById(id)
                         .orElseThrow()
            );
  }
}
