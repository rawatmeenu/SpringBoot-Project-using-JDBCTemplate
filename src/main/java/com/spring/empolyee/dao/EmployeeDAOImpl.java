package com.spring.empolyee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.empolyee.mapper.EmployeeMapper;
import com.spring.empolyee.mapper.EmployeeMapperImpl;
import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;


@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	 JdbcTemplate jdbcTemplate;
	

	//private EmployeeMapper mapper;
	
	
	@Override
	public int insert(Employee employee) {
		String query="insert into Emp_tbl(empId,empName,empDepartment,emailId) values (?,?,?,?)";
		//, password
		int r = this.jdbcTemplate.update(query, new Object[] {employee.getEmpId(),employee.getEmpName(), employee.getEmpDepartment(), employee.getEmailId()});
		//, employee.getPassword()
		return r;
	}
	
	@Override
	public int update(Employee employee, int empId) {
		String query="update Emp_tbl set empName=?, empDepartment=?, emailId =? where empId=?";
		int r = this.jdbcTemplate.update(query,new Object[] {employee.getEmpName(), employee.getEmpDepartment(),employee.getEmailId(),empId});
		//employee.getPassword()
		return r;
	}


	@Override
	public Employee getEmployeeById(int empId) 
	{
		String query ="SELECT * FROM Emp_tbl WHERE empId =?";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		Employee employee= this.jdbcTemplate.queryForObject(query, rowMapper, empId);
		return employee;
	}

	@Override
	public List<Employee> getAllEmp() 
	{
		String q= "SELECT * FROM Emp_tbl";
		List<Employee> employee = this.jdbcTemplate.query(q, new RowMapperImpl());
		return employee;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	


}
