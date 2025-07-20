package com.tranquyen.store2.controller;

import com.tranquyen.store2.dto.request.UserRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController
{
  @PostMapping("/")
  public String addUser(@RequestBody UserRequestDTO userDTO){
    return "User added 2";
  }
}
