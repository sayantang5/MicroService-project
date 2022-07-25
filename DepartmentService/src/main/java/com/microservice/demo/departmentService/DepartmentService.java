package com.microservice.demo.departmentService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.demo.entity.Department;
import com.microservice.demo.repository.DepartmentRepo;


@Service
public class DepartmentService {
	
	
	@Autowired
	DepartmentRepo dRepo;
	
	
	public Department saveDepartment( Department dept)
	{
		
		Department savedDept = dRepo.save(dept);
		
		return savedDept;
		
		
	}
	
	
	

	public Department getDeptById( Long  id)
	{
		
		Optional<Department> findById = dRepo.findById(id);
		
		return findById.get();
		
		
	}
}
