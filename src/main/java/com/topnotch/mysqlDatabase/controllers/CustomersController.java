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

import com.topnotch.mysqlDatabase.models.Customers;
import com.topnotch.mysqlDatabase.repositories.CustomersRepository;

@RestController
@RequestMapping("api/v1/customers")
public class CustomersController {

	@Autowired
	private CustomersRepository repository;
	
	public CustomersController() {
		
	}
	
	@GetMapping("/all")
	public List<Customers> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Customers create(@RequestBody final Customers customer) {
		return repository.saveAndFlush(customer);
	}
	
	@GetMapping("{id}")
	public Customers read(@PathVariable Integer id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Customers update(@RequestBody Customers source, @PathVariable Integer id) {
		
		Customers target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
