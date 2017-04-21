/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsreddy.userdetails.user;

import java.util.Date;

/**
 *
 * @author gcsreddy
 */
public class ProfessionalInfo {
  
  private String grade;
  
  private String Department;
  
  private String Designation;
  
  private Date hireDate;

  public ProfessionalInfo() {
  }

  
  
  public ProfessionalInfo(String grade, String Department, String Designation, Date hireDate) {
    this.grade = grade;
    this.Department = Department;
    this.Designation = Designation;
    this.hireDate = hireDate;
  }
  
  

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getDepartment() {
    return Department;
  }

  public void setDepartment(String Department) {
    this.Department = Department;
  }

  public String getDesignation() {
    return Designation;
  }

  public void setDesignation(String Designation) {
    this.Designation = Designation;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }
  
  
  
}
