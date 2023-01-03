package com.sakasoft.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakasoft.crud.entity.EmployeeDetails;
import com.sakasoft.crud.repository.EmployeeDetailsRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDetailsRepo empdetailsrepo;

	@Override
	public String createEmployee(EmployeeDetails emp) {
		EmployeeDetails empd = empdetailsrepo.save(emp);
		return "....Employee details are successfully saved.....";
	}

	@Override
	public List<EmployeeDetails> getEmployee() {
		
		return empdetailsrepo.findAll();
	}

	@Override
	public EmployeeDetails getEmployee(int id) {
		Optional<EmployeeDetails> emp1 = empdetailsrepo.findById(id);
		if(emp1.isPresent()) {
			return emp1.get();
		}
		return null;
	}

	@Override
	public String deleteEmployee(int id) {
		 empdetailsrepo.deleteById(id);
		return "Employee details deleted successfully...";
	}

}
