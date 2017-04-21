/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsreddy.userdetails.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcsreddy
 */
@Service
public class EmployeeService{
  
  @Autowired
  private EmployeeRepository employeeRepository;

  public Employee getEmployee(String userName) {
  
    return employeeRepository.findOne(userName);
    
  }

  public Employee addEmployee(Employee employee) {
        
    return employeeRepository.save(employee);

  }

  public Employee updateEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  public void deleteEmployee(String userName) {
    employeeRepository.delete(userName);
  }

  
}
