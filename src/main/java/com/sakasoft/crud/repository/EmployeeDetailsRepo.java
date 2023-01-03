package com.sakasoft.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakasoft.crud.entity.EmployeeDetails;
@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer> {

}
