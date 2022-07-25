package com.example.Microservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Microservice.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
