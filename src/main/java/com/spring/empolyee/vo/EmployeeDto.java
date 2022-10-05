package com.spring.empolyee.vo;

public class EmployeeDto {
	private int empId;
	private String empName;
	private String empDepartment;
	private String emailId;
	public int getEmpId() {
		return empId;
	}
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
		this.empDepartment = empDepartment;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public EmployeeDto(int empId, String empName, String empDepartment, String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.emailId = emailId;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
