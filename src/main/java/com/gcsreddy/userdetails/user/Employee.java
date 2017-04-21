/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsreddy.userdetails.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author gcsreddy
 */
@Entity(name = "employee")
public class Employee {
  
  /**
   * User Name : email
   */
  @Id
  @Column(name = "email")
  private String userName; //emailid
  
  /**
   * First Name
   */
  @Column(name = "first_name")
  private String firstName;
  
  /**
   * Last Name
   */
  @Column(name = "last_name")
  private String lastName;

  public Employee() {
  }

  public Employee(String userName, String firstName, String lastName) {
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  
  
}
