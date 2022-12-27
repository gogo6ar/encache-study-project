package com.example.ehcachestudyproject.model.dto;

import com.example.ehcachestudyproject.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserToDTOMapper implements Mapper<User, UserDTO>{

  @Override
  public UserDTO map(User entity) {
    return UserDTO.builder()
            .id(entity.getId())
            .name(entity.getName())
            .password(entity.getPassword().orElse(""))
            .build();
  }
}
