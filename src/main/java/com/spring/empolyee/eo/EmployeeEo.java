package com.spring.empolyee.eo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;

@Service
public interface EmployeeEo {
	public int insert(Employee employee);
	public int update(Employee employee,int empId);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmp();

}
