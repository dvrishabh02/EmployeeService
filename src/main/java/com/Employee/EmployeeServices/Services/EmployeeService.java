package com.Employee.EmployeeServices.Services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.EmployeeServices.Entity.Employee;
import com.Employee.EmployeeServices.Repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private Employee emp;
	
	public String saveEmployee(Employee emp) {
		
		if(empRepo.save(emp).equals("saved")) {
			return "saved";
		}
		return "Not";
	}
	
	public Employee getEmployee(int id) {
		
			emp=empRepo.getEmpById(id);	
			return emp;	
	}
	
	public HashMap<Integer, Employee> getAllEmployee(){
		
		
		return empRepo.getAllEmployee();
	}

}
