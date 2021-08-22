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

import com.topnotch.mysqlDatabase.models.Payments;
import com.topnotch.mysqlDatabase.models.PaymentsID;
import com.topnotch.mysqlDatabase.repositories.PaymentsRepository;


@RestController
@RequestMapping("api/v1/payments")
public class PaymentsController {

	@Autowired
	private PaymentsRepository repository;
	
	@GetMapping("/all")
	public List<Payments> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Payments create(@RequestBody final Payments office) {
		return repository.saveAndFlush(office);
	}
	
	@GetMapping("{id}")
	public Payments read(@PathVariable PaymentsID id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Payments update(@RequestBody Payments source, @PathVariable PaymentsID id) {
		
		Payments target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable PaymentsID id) {
		repository.deleteById(id);
	}
}
