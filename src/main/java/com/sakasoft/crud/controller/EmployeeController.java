package com.sakasoft.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sakasoft.crud.entity.EmployeeDetails;
import com.sakasoft.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;

	@PostMapping("/emp")
	public ResponseEntity<String> Employee(@RequestBody EmployeeDetails emp) {
		String status = empservice.createEmployee(emp);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/emps")
	public ResponseEntity<List<EmployeeDetails>> getAllEmployees() {
		List<EmployeeDetails> allEmp = empservice.getEmployee();
		return new ResponseEntity<>(allEmp, HttpStatus.OK);

	}

	@GetMapping("/emp/{id}")
	public ResponseEntity<EmployeeDetails> getEmployeeById(@PathVariable int id) {
		EmployeeDetails emp = empservice.getEmployee(id);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}

	@DeleteMapping("/emp/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		System.out.println(id);
		String deleteEmployee = empservice.deleteEmployee(id);
		return new ResponseEntity<>(deleteEmployee, HttpStatus.OK);
	}

}
