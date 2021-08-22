package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
