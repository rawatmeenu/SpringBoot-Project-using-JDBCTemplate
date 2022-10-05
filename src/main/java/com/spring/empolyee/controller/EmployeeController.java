package com.spring.empolyee.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.empolyee.eo.EmployeeEo;
import com.spring.empolyee.mapper.EmployeeMapper;
import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeEo empeo;
	
	@Autowired
	EmployeeMapper mapper;

	private final Logger LOGGER =LoggerFactory.getLogger(EmployeeController.class); 
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		//*
		LOGGER.info("Saving data in the Database!");
		return empeo.insert(employee) + "Number of rows saved to Database" ;
		//return new String(mapper.modeltoDto(empeo.insert(employee)));
	}
	
	
//	@PostMapping("/employees")
//	public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto empdto)
//	{
//		Employee emp= mapper.modeltoDto(empdto);
//		System.out.println("empmapper" + mapper);
//		empeo.insert(employee);
//		return ResponseEntity.status(HttpStatus.CREATED).body(empdto);
//		
//	}
	
	@PutMapping("/employees/{empId}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int empId)
	{
		LOGGER.info("Data Updated for EmpId: " + empId);
		return empeo.update(employee,empId) + "No. of rows updated to Database";
		
		
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		LOGGER.info("Retrieving all the data from the database!");
		return empeo.getAllEmp();
	}
	
	

	
	@GetMapping("/employee/{empId}")
	public EmployeeDto getEmployeeById(@PathVariable int empId)
	{
		LOGGER.info("Data Fetching for EmpId: " + empId);
		Employee employee = empeo.getEmployeeById(empId);
		return mapper.modeltoDto(employee);
		//return empeo.getEmployeeById(empId);
	}
	
	

}





















//@GetMapping(value = "/{empId}")
//public ResponseEntity<?> getUser (@PathVariable("empId") int empId) {
//    Employee employee = empDAO.getEmployeeById(empId);
//    if(employee == null) {
//        return new ResponseEntity<String>("No User found with this : " + empId, HttpStatus.NOT_FOUND);
//    }
//    return new ResponseEntity<Employee>(employee, HttpStatus.OK);
//}
