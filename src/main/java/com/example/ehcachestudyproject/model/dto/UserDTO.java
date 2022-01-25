package com.example.ehcachestudyproject.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

  private Long id;
  private String name;
  private String password;
}
