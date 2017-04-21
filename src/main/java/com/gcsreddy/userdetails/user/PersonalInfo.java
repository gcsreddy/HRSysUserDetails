package com.gcsreddy.userdetails.user;

import java.util.Date;

/**
 *
 * @author gcsreddy
 */
public class PersonalInfo {
  
  String gender;
  
  Date dateOfBirth;

  public PersonalInfo() {
  }

  public PersonalInfo(String gender, Date dateOfBirth) {
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  
}
