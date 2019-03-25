package com.journaldev.spring.controller;


import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Access;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c2t.annotation.basic.Employee;
import com.c2t.annotation.basic.EmployeeVo;
import com.journaldev.spring.service.EmployeeService;






@Controller	
public class EmployeeController {
	
	Map<Integer , Employee> empData  = new HashMap<Integer, Employee>();
	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	EmployeeService s;
	
//	@RequestMapping(value = "/rest/emp/dummy1" , method=  RequestMethod.GET)
//	public @ResponseBody Employee getDummyEmployee() {
//		
//		Employee emp = new Employee();
//		emp.setId(99);
//		emp.setName("Dummy");
//		emp.setCreatedDate(new Date());
////		empData.put(9999,emp);
//		return emp;
	//}
	
	
	
//	@RequestMapping(value = "/rest/emp/dummy1" , method=  RequestMethod.GET)
//	public @ResponseBody com.c2t.annotation.basic.Employee getDummyEmployee() {
//		
//			//logger.info("Start getDummyEmployee");
//			Employee emp = new Employee();
//			
//			emp.setId(1000l);
//			emp.setFirstname("dummy3");
//			emp.setBirthDate(new java.sql.Date(1996, 06, 23));
//			emp.setLastname("dummyL");
//			emp.setCellphone("889977665");
//			
//			Session s = sf.openSession();
//			s.beginTransaction();
//			s.save(emp);
//			s.getTransaction().commit();
//			
//			
//		
//		return emp;
//	}
	
//	@RequestMapping(value="/get", method=RequestMethod.GET)
//	public @ResponseBody  Employee getDummyEmployee1() 
//	{
//		return  (Employee)sf.openSession().get(Employee.class, 2l);
//	}
	
	@RequestMapping(value = "/GET_ALL_EMP", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees() {
		//logger.info("Start getAllEmployees.");
		/*List<Employee> emps = new ArrayList<Employee>();
		Set<Integer> empIdKeys = empData.keySet();
		for(Integer i : empIdKeys){
			emps.add(empData.get(i));*/
		
		
		//String sql ="select e from Employee e";
		//return  sf.openSession().createQuery(sql).list();
		return s.getAllEmployees();
		
		
		}
		
//	
//	@RequestMapping(value="rest/em/dummy/list", method=RequestMethod.GET)
//
//	public @ResponseBody EmployeeVo getDummyEmployeeList()
//
//	{
//
//		Query q = sf.openSession().createQuery("from Employee");
//
//		List <Employee> list = q.list();
//
//	     EmployeeVo e1=new EmployeeVo();
//
//	     e1.setEmployees(list);
//
//		return e1;
//
//	
//
//	}	
//
//	
//	@RequestMapping(value="/rest/emp/{id}",method = RequestMethod.GET)
//
//	public @ResponseBody Employee getemp(@PathVariable ("id") int empid)
//
//	{
//
//		Session s = sf.openSession();
//
//		Employee emp = (Employee)s.get(Employee.class, new Long(empid));
//
//
//		System.out.println("----------------------------------");
//
//		System.out.println(emp);
//
//		
//		System.out.println(emp.getId());
//
//		
//
//		return emp;
//	}
//
//	@RequestMapping(value="/rest/del/{id}",method = RequestMethod.GET)
//
//	public @ResponseBody Employee getdel(@PathVariable ("id") int empid)
//
//	{
//
//		Session s = sf.openSession();
//
//
//		Employee emp = (Employee)s.get(Employee.class, new Long(empid));
//		System.out.println("----------------------------------");
//		s.delete( emp);
//	//	System.out.println(emp);
//
//		s.beginTransaction().commit();
//	//	System.out.println(emp.getId());
//
//		
//
//		return emp;
//	}
//
//	
//	
	
	
	
	

	}

