package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.ProductLines;

public interface ProductLinesRepository extends JpaRepository<ProductLines,String>{

}
