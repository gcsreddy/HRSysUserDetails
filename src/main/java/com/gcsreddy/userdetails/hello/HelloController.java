/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsreddy.userdetails.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gcsreddy
 */
@RestController
public class HelloController {
  //can have methods in this class mapped to url requests
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String sayHi(){
    return "Hellooollkk";
  }
}
