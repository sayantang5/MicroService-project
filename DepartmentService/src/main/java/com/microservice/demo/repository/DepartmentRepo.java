package com.microservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.demo.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
