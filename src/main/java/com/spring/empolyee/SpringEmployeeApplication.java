package com.spring.empolyee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.empolyee.mapper.EmployeeMapper;
import com.spring.empolyee.mapper.EmployeeMapperImpl;

@SpringBootApplication
public class SpringEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeApplication.class, args);
	}
	
	
   @Bean
	public EmployeeMapper mapper()
	{
	   return new EmployeeMapperImpl();
	
	}
}
	