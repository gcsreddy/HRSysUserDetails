/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsreddy.userdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author gcsreddy
 */
@SpringBootApplication //tells that this is a springboot application
public class UserDetailsApp {
  public static void main(String[] args){
    //tell springboot to start a servlet container and host this application.
    //sets up default config
    //starts spring application context
    //performs class path scan
    //starts tomcat server
    SpringApplication.run(UserDetailsApp.class, args);
  }
}
