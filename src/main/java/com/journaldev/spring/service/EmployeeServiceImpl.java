package com.journaldev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.c2t.annotation.basic.Employee;
import com.journaldev.spring.Dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeDao {
	

		@Autowired
		//@Qualifier (value="employeeDaoImpl")
		EmployeeDaoImpl dao;

		public List<Employee> getAllEmployees() {
			return (List<Employee>) dao.getEmployees();
		}


	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

	
