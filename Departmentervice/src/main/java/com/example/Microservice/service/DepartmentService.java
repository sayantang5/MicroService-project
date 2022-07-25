package com.example.Microservice.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Microservice.entity.Department;
import com.example.Microservice.repository.DepartmentRepo;



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