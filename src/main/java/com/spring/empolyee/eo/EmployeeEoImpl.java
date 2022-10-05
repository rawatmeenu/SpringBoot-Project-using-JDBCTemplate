package com.spring.empolyee.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.empolyee.controller.EmployeeController;
import com.spring.empolyee.dao.EmployeeDAO;
import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;


@Component
public class EmployeeEoImpl implements EmployeeEo
{
	@Autowired
	private EmployeeDAO empdao;
	
	private final Logger LOGGER =LoggerFactory.getLogger(EmployeeEoImpl.class);
	
	@Override
	public int insert(Employee employee) {
		LOGGER.info("Data saved...");
		return empdao.insert(employee);
	}

	@Override
	public int update(Employee employee, int empId) {
		LOGGER.info("Data Updated...");
		return empdao.update(employee, empId);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		LOGGER.info("Data Fetched");
		return empdao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getAllEmp() {
		LOGGER.info("Data Fetched from the database!");
		return empdao.getAllEmp();
	}

}
