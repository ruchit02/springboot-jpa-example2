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

import com.topnotch.mysqlDatabase.models.Products;
import com.topnotch.mysqlDatabase.repositories.ProductsRepository;

@RestController
@RequestMapping("api/v1/products")
public class ProductsController {

	@Autowired
	private ProductsRepository repository;
	
	@GetMapping("/all")
	public List<Products> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Products create(@RequestBody final Products office) {
		return repository.saveAndFlush(office);
	}
	
	@GetMapping("{id}")
	public Products read(@PathVariable String id) {
		return repository.getById(id);
	}
	
	@PutMapping("{id}")
	public Products update(@RequestBody Products source, @PathVariable String id) {
		
		Products target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
