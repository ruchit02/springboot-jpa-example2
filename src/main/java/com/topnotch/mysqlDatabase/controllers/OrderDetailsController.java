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

import com.topnotch.mysqlDatabase.models.OrderDetails;
import com.topnotch.mysqlDatabase.models.OrderDetailsID;
import com.topnotch.mysqlDatabase.repositories.OrderDetailsRepository;


@RestController
@RequestMapping("api/v1/orderdetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsRepository repository;
	
	@GetMapping("/all")
	public List<OrderDetails> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public OrderDetails create(@RequestBody final OrderDetails office) {
		return repository.saveAndFlush(office);
	}
	
	@GetMapping("{id1}_{id2}_{id3}")
	public OrderDetails read(@PathVariable String id1, @PathVariable String id2, @PathVariable String id3) {
		return repository.getById( new OrderDetailsID( new Integer(id1), id2+"_"+id3 ) );
	}
	
	@PutMapping("{id}")
	public OrderDetails update(@RequestBody OrderDetails source, @PathVariable OrderDetailsID id) {
		
		OrderDetails target = repository.getById(id);
		BeanUtils.copyProperties(source, target);
		return repository.saveAndFlush(target);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable OrderDetailsID id) {
		repository.deleteById(id);
	}
}
