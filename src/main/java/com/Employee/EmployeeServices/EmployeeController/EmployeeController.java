package com.Employee.EmployeeServices.EmployeeController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.EmployeeServices.DataUtil.EmployeeDAO;
import com.Employee.EmployeeServices.Entity.Employee;
import com.Employee.EmployeeServices.Services.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/EmployeeApp")
public class EmployeeController {
	
	
	@Autowired
	private Employee emp;
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/All")
	public String getAllEmployee() {
		return "Here we'll have the list of all the Employees";
	}
	
	@PostMapping("/Employee")
	public String saveEmployee(@RequestBody EmployeeDAO employeeDAO) {
		emp.setId(employeeDAO.getId());
		emp.setName(employeeDAO.getName());
		emp.setDepartment(employeeDAO.getDepartment());
		
		if(empService.saveEmployee(emp).equals("saved"))		
				return "Sucess fully saved";	
		
		return "not saved";
	}
	
	@GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {		
		System.out.println("id requested is "+id);    	
    	emp = empService.getEmployee(id);
    	if(emp!=null) {
    		  
    		return emp; 
    	}
    	return null;
    }
	
	@GetMapping("/all")
    public List<Employee> getAllEmployee1() {		
		
    	HashMap<Integer, Employee> result = empService.getAllEmployee();
    	
    	List<Employee>ls = new ArrayList<Employee>();
    	for(Employee e : result.values()) {
    		ls.add(e);
    	}
    	
    	return ls;
    	
    }
    	
    	
	

}
