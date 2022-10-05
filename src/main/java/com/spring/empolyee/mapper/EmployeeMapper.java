package com.spring.empolyee.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.spring.empolyee.model.Employee;
import com.spring.empolyee.vo.EmployeeDto;


@Mapper(componentModel = "spring") 
public interface EmployeeMapper {
	
	EmployeeMapper Instance = Mappers.getMapper(EmployeeMapper.class);
	 
	
	EmployeeDto modeltoDto(Employee employee);
	//Employee dtotoModel(EmployeeDto empdto);
	
	//List<EmployeeDto> modeltoDtoLists(List<Employee> employee);
	
	

}