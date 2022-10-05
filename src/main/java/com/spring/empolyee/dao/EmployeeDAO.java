package com.spring.empolyee.dao;

import java.util.List;

import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;



public interface EmployeeDAO {
	
	public int insert(Employee employee);
	
	public int update(Employee employee,int empId);
	
	public Employee getEmployeeById(int empId);
	
	public List<Employee> getAllEmp();
	
	
	
	
}
