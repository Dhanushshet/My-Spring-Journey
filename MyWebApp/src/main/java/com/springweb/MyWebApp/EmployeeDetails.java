package com.springweb.MyWebApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetails {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/Details")
	public List<Employee> getDetails(){
		
		return employeeService.getDetails();
		
	}
	@RequestMapping("/Details/{name}")
	public Employee getDetails(@PathVariable String name) {
		return employeeService.getEmployee(name);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/Details")
	public void addEmployeeDetails(@RequestBody Employee employee) {
		employeeService.addEmployeeDetails(employee);
		
	
}

}