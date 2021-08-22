package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.OrderDetails;
import com.topnotch.mysqlDatabase.models.OrderDetailsID;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,OrderDetailsID> {

}
