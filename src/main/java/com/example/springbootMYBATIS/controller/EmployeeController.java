package com.example.springbootMYBATIS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootMYBATIS.mapper.EmployeesMapper;
import com.example.springbootMYBATIS.model.Employees;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeesMapper repository;

	/*@GetMapping("/users")
	public ResponseEntity<List<Employees>> listAllEmployeess() {
		List<Employees> employees = (List<Employees>) repository.findAll();
		if (employees.isEmpty())
			return new ResponseEntity<List<Employees>>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Employees>>(employees, HttpStatus.OK);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable long id) {
		Optional<Employees> employee = repository.findById(id);
		if (employee.isPresent())
			return new ResponseEntity<Employees>(employee.get(), HttpStatus.OK);
		else
			return new ResponseEntity<Employees>(HttpStatus.NOT_FOUND);
	}*/

	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody Employees employee) {
		repository.insert(employee);
		return new ResponseEntity<Employees>(HttpStatus.CREATED);
	}

	@PutMapping("/user")	
	public ResponseEntity<?> updateUser(@RequestBody Employees employee) {
		repository.updateByPrimaryKey(employee);
		return new ResponseEntity<Employees>(HttpStatus.OK);
	}
}
