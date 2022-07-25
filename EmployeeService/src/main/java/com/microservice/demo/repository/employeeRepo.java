package com.microservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.demo.entity.employee;

public interface employeeRepo extends JpaRepository<employee, Long> {

}
