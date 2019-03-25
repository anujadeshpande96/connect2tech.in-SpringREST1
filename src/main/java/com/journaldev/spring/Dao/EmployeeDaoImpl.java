package com.journaldev.spring.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c2t.annotation.basic.Employee;
import com.journaldev.spring.service.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sf;
	
	public Employee setEmp(Employee emp)
	{
		sf.openSession().beginTransaction();
		return emp;
		
	}

	
	
	
	public Employee getEmployee()
	{
		return (Employee) sf.getCurrentSession().get(Employee.class, 3l);
	}
	
	
	public List<?> getEmployees()
	{
		return sf.getCurrentSession().createCriteria("select e from Employee e").list();
	}
	
	public String delete(Long empId)
	
	{
		Session s = sf.openSession();
		Employee emp = (Employee)s.get(Employee.class, new Long(empId));
		System.out.println("----------------------------------");
		s.delete( emp);
	

		s.beginTransaction().commit();
		return "deleted";
	

		
		
	}
	
	
}
