package com.microservice.demo.departmentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.demo.departmentService.DepartmentService;
import com.microservice.demo.entity.Department;

@RestController
@RequestMapping("/department")
public class departmentController {
	
	@Autowired
	DepartmentService servive ;
	
	
	
	@PostMapping("/savedept")
	public ResponseEntity<Department> saveDepartment( @RequestBody Department dept)
	{
		
		
		Department saveDepartment = servive.saveDepartment(dept);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(saveDepartment);
		
	}
	
	
	@GetMapping("/getDept/{id}")
	public ResponseEntity<Department> saveDepartment(@PathVariable Long id)
	{
		
		
		  Department deptById = servive.getDeptById(id);
		
		return ResponseEntity.status(HttpStatus.FOUND).body(deptById);
		
		
		
	}

}
