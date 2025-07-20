package com.tranquyen.store2.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserRequestDTO implements Serializable
{
  @NotBlank(message = "firstName must be not blank!")
  private String firstName;
  private String lastName;
  private String phone;
  private String email;

}
