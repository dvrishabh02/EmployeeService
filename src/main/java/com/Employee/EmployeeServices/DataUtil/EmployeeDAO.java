package com.Employee.EmployeeServices.DataUtil;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDAO {
	
	private int id;
	private String Name;
	private String Department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
