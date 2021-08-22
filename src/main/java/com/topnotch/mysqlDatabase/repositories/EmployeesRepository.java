package com.topnotch.mysqlDatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topnotch.mysqlDatabase.models.Employees;

public interface EmployeesRepository extends JpaRepository<Employees,Integer>{

}
