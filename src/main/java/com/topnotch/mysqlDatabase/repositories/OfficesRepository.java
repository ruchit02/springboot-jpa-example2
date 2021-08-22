package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Offices;

public interface OfficesRepository extends JpaRepository<Offices,String> {

}
