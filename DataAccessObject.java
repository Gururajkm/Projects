package com.Qac.Fruits.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.Qac.Fruits.Entity.Fruits_Details;

@Component
public class DataAccessObject implements DataAccess {
	
	private SessionFactory sessiofactory;
	
    public void save(Fruits_Details fruits) {
		Session session = sessiofactory.openSession();
		Transaction transaction  =session.beginTransaction();
		session.save(transaction);
		transaction .commit();
		System.out.println("Data saved");
		
		
	}
	
}
