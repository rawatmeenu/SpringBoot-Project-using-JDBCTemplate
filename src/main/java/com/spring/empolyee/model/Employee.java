package com.spring.empolyee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class Employee {
	
	@NotNull(message = "EmpID is mandatory")
	private int empId;
	
	@NotNull(message = "EmpName is mandatory")
	@Length(min=3, max=255)
	private String empName;
	
	@NotNull(message = "Department is mandatory")
	private String empDepartment;
	public int getEmpId() {
		return empId;
	}
	
	@NotNull
	@Email(regexp= ".+[@].+[\\.].+")
	private String emailId;
	
	@NotNull
	@Pattern(regexp= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,30}$" ,message="length must be 8 characters")  
	private String password;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment= empDepartment;
	}
	
	
	public Employee(@NotNull(message = "EmpID is mandatory") int empId,
			@NotNull(message = "EmpName is mandatory") @Length(min = 3, max = 255) String empName,
			@NotNull(message = "Department is mandatory") String empDepartment,
			@NotNull @Email(regexp = ".+[@].+[\\.].+") String emailId,
			@NotNull @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,30}$", message = "length must be 8 characters") String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.emailId = emailId;
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + ", emailId="
				+ emailId + ", password=" + password + "]";
	}
	
	
	

}
