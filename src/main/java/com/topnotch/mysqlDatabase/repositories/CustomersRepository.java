package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Customers;

public interface CustomersRepository extends JpaRepository<Customers,Integer>{

}
