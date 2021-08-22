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

import com.topnotch.mysqlDatabase.models.Orders;
import com.topnotch.mysqlDatabase.repositories.OrdersRepository;


@RestController
@RequestMapping("api/v1/orders")
public class OrdersController {

	@Autowired
	private OrdersRepository repository;
	
	@GetMapping("/all")
	public List<Orders> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Orders create(@RequestBody final Orders office) {
		return repository.saveAndFlush(office);
	}
	
	@GetMapping("{id}")
	public Orders read(@PathVariable Integer id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Orders update(@RequestBody Orders source, @PathVariable Integer id) {
		
		Orders target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
