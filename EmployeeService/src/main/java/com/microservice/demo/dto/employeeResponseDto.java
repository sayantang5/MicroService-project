package com.microservice.demo.dto;

import com.microservice.demo.entity.employee;

public class employeeResponseDto {
	
	private employee emp;
	
	private departmentDto deptdto;

	public employee getEmp() {
		return emp;
	}

	public void setEmp(employee emp) {
		this.emp = emp;
	}

	public departmentDto getDeptdto() {
		return deptdto;
	}

	public void setDeptdto(departmentDto deptdto) {
		this.deptdto = deptdto;
	}
	
	
	

}
