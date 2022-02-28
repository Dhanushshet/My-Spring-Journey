package com.springweb.MyWebApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class EmployeeService {

	
	private List<Employee> Details = new ArrayList<>(Arrays.asList(new Employee("David",23,25000),
			new Employee("Mike",25,30000),
			new Employee("Henry",26,35000),
			new Employee("Charles",27,45000)));
	
	public List<Employee> getDetails(){
		
		return Details;
	}
	public Employee getEmployee(String name) {
		return (Employee) Details.stream().filter(t->t.getName().equals(name)).findFirst().get();
		
	}
	public void addEmployeeDetails(Employee employee) {
		Details.add(employee);
		
	} 

}
