package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Products;

public interface ProductsRepository extends JpaRepository<Products,String>{

}
