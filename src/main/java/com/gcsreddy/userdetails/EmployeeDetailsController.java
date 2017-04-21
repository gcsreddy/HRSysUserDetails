package com.gcsreddy.userdetails;

import com.gcsreddy.userdetails.user.Employee;
import com.gcsreddy.userdetails.user.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gcsreddy
 */
@RestController
public class EmployeeDetailsController {
  
  @Autowired
  private EmployeeService employeeService;
  
  //http://stackoverflow.com/questions/16332092/spring-mvc-pathvariable-with-dot-is-getting-truncated
  @RequestMapping(value = "/users/{username:.+}", 
          method = RequestMethod.GET)
  public Employee getEmployee(@PathVariable(name = "username") String userName){
    
    Employee employee =  employeeService.getEmployee(userName);
    return employee;
  }
  
  @RequestMapping(method = RequestMethod.POST, value = "/users")
  public Employee addEmployee(@RequestBody Employee employee){
    
    return employeeService.addEmployee(employee);
    
  }
  
  @RequestMapping(method = RequestMethod.PUT, value = "/users")
  public Employee updateEmployee(@RequestBody Employee employee){
    
    return employeeService.updateEmployee(employee);
    
  }
  
  //http://stackoverflow.com/questions/16332092/spring-mvc-pathvariable-with-dot-is-getting-truncated
  @RequestMapping(method = RequestMethod.DELETE, value = "/users/{username:.+}")
  public void deleteEmployee(@PathVariable(name = "username") String userName){
    
    employeeService.deleteEmployee(userName);
  }
  
  
}
