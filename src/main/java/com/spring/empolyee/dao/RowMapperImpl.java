package com.spring.empolyee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;



public class RowMapperImpl implements RowMapper<Employee> {
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee= new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setEmpName(rs.getString(2));
		employee.setEmpDepartment(rs.getString(3));
		employee.setEmailId(rs.getString(4));
		//employee.setPassword(rs.getString(5));
		return employee;
	}
	

}
