package com.tranquyen.store2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController
{
  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
  public String getAllProduct(){
    return "You got all product data";
  }
}
