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

import com.topnotch.mysqlDatabase.models.Offices;
import com.topnotch.mysqlDatabase.repositories.OfficesRepository;

@RestController
@RequestMapping("api/v1/offices")
public class OfficesController {

	@Autowired
	private OfficesRepository repository;
	
	@GetMapping("/all")
	public List<Offices> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Offices create(@RequestBody final Offices office) {
		return repository.saveAndFlush(office);
	}
	
	@GetMapping("{id}")
	public Offices read(@PathVariable String id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Offices update(@RequestBody Offices source, @PathVariable String id) {
		
		Offices target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
