package com.microservice.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.demo.dto.departmentDto;
import com.microservice.demo.dto.employeeResponseDto;
import com.microservice.demo.entity.employee;
import com.microservice.demo.repository.employeeRepo;

@Service
@EnableCircuitBreaker
public class EmployeeService {

	private static String DEPTURL = "http://DERARTMENT-SERVICE/department/getDept/{deptid}";

	@Autowired
	employeeRepo repo;

	@Autowired
	RestTemplate rest;

	public employee saveEmployee(employee emp) {
		employee empobj = repo.save(emp);

		return empobj;

	}

	
	
	
	@CircuitBreaker(name = "example", fallbackMethod="fallback")
	public employeeResponseDto getEmpById(Long id) {
		Optional<employee> findById = repo.findById(id);

		employee emp = findById.get();

		Long deptid = emp.getDepartmentId();

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("deptid", deptid);

		// rest.getForObject(DEPTURL, HttpMethod.GET ,deptid,departmentDto.class);

		ResponseEntity<departmentDto> forEntity = rest.getForEntity(DEPTURL, departmentDto.class, map1);
		departmentDto body = forEntity.getBody();

		employeeResponseDto respDto = new employeeResponseDto();

		respDto.setDeptdto(body);
		respDto.setEmp(emp);

		return respDto;

	}

}