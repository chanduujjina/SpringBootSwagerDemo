package com.coolcoder.servcice;

import org.springframework.stereotype.Service;

import com.coolcoder.dto.Employee;

@Service
public class EmployeeService {
	
	public Employee addEmployee(Employee employee) {
		employee.setId(1);
		return employee;
	}

}
