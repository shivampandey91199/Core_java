package com.example.demo.service;

import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import org.hibernate.SessionFactory;
@Service
public class userService {

	private static SessionFactory sessionFactory;   
		
	public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                // Load hibernate.cfg.xml from resources
	                sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	            } catch (Exception e) {
	                e.printStackTrace();
	                throw new RuntimeException("There was a problem creating the SessionFactory!");
	            }
	        }
	        return sessionFactory;
	    
	}
	
}
