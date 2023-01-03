package com.sakasoft.crud.service;

import java.util.List;

import com.sakasoft.crud.entity.EmployeeDetails;

public interface EmployeeService {
	public String createEmployee(EmployeeDetails emp);

	public List<EmployeeDetails> getEmployee();

	public EmployeeDetails getEmployee(int id);

	public String deleteEmployee(int id);

}
