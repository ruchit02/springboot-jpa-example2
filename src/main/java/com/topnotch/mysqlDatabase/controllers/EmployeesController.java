package com.topnotch.mysqlDatabase.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topnotch.mysqlDatabase.models.Employees;
import com.topnotch.mysqlDatabase.repositories.EmployeesRepository;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeesController {

	@Autowired
	private EmployeesRepository repository;
	
	@GetMapping("/all")
	public List<Employees> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Employees create(@RequestBody final Employees employee) {
		return repository.saveAndFlush(employee);
	}
	
	@GetMapping("{id}")
	public Employees read(@PathVariable Integer id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Employees update(@RequestBody Employees source, @PathVariable Integer id) {
		
		Employees target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
