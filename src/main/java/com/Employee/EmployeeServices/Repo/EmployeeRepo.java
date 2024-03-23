package com.Employee.EmployeeServices.Repo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Employee.EmployeeServices.Entity.Employee;

@Repository
public class EmployeeRepo {
	
	@Autowired
	private Employee employee;
	
	HashMap<Integer, Employee>db = new HashMap<>();
	public EmployeeRepo() {
        db.put(1, new Employee(1, "Rishabh", "Construction"));
        db.put(2, new Employee(2, "Sharma", "Information Tech"));
        db.put(3, new Employee(3, "Jagdeesh", "CSE"));
        db.put(4, new Employee(4, "Ram", "IT dept"));
        
    }
	//This method save new employee in MAP - comment for git
	public String save(Employee emp) {
		int id = emp.getId();
		if(db.containsKey(id)) {
			return "Can not be saved, Employe Already Exisit";
		}else {
			db.put(id, emp);
		}
		return "saved";
			
		// TODO Auto-generated method stub		
	}
	
	public Employee getEmpById(int id) {
		if(!db.containsKey(id)) {
			return null;
		}
		employee = db.get(id);
		
		return employee;
	}
	
	public HashMap<Integer, Employee> getAllEmployee(){
		
		return db;
	}
}
