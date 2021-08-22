package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Payments;
import com.topnotch.mysqlDatabase.models.PaymentsID;

public interface PaymentsRepository extends JpaRepository<Payments,PaymentsID>{

}
