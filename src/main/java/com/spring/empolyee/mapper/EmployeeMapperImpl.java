package com.spring.empolyee.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;

public class EmployeeMapperImpl implements EmployeeMapper {
	
	



	@Override
	public EmployeeDto modeltoDto(Employee employee) {
		
		  if(employee == null) {
			  return null; 
			  } 
		  else
		  { 
			  EmployeeDto empdto = new  EmployeeDto(); 
			  empdto.setEmpId(employee.getEmpId());
			  empdto.setEmpName(employee.getEmpName());
			  empdto.setEmpDepartment(employee.getEmpDepartment());
			  empdto.setEmailId(employee.getEmailId()); 
			  return empdto; 
			  }
		 
	}

	

//	@Override
//	public List<EmployeeDto> modeltoDtoLists(List<Employee> employee) {
//		if(employee == null)
//		{
//			return null;
//		}
//		
//		List<EmployeeDto> list= new ArrayList<EmployeeDto>(employee.size());
//		for(Employee e : employee )
//	{
//				list.add(modeltoDto(e));
//			}
//			return list;
//		
//	}



	

//	@Override
//	public Employee dtotoModel(EmployeeDto empdto) {
//		Employee employee= new Employee();
//		employee.setEmpId(employee.getEmpId());
//		employee.setEmpName(employee.getEmpName());
//		employee.setEmpDepartment(employee.getEmpDepartment());
//		employee.setEmailId(employee.getEmailId());
//		return employee;
//		}



}
