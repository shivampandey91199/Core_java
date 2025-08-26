package com.example.demo.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.demo.Model.Student;

public class create {
 
	
	    public static void main(String[] args) {
	        // CREATE
	        createStudent(new Student(1, "Shivam", "Pandey"));
	        createStudent(new Student(2, "Rahul", "Sharma"));

	        // READ
	        Student s1 = readStudent(1);
	        System.out.println("Fetched Student: " + s1);

	        // UPDATE
	        updateStudent(1, "ShivamUpdated", "PandeyUpdated");

	        // READ again
	        Student s2 = readStudent(1);
	        System.out.println("Updated Student: " + s2);

	        // DELETE
	        deleteStudent(2);

	        // READ after delete
	        Student s3 = readStudent(2);
	        System.out.println("After delete fetch: " + s3);

	        
	    }

	    // CREATE
	    public static void createStudent(Student student) {
	        Session session = userService.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(student);
	        tx.commit();
	        session.close();
	        System.out.println("Saved: " + student);
	    }

	    // READ
	    public static Student readStudent(int id) {
	        Session session = userService.getSessionFactory().openSession();
	        Student student = session.get(Student.class, id);
	        session.close();
	        return student;
	    }

	    // UPDATE
	    public static void updateStudent(int id, String newFirstName, String newLastName) {
	        Session session = userService.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();

	        Student student = session.get(Student.class, id);
	        if (student != null) {
	            student.setFirstName(newFirstName);
	            student.setLastName(newLastName);
	            session.update(student);
	            System.out.println("Updated: " + student);
	        } else {
	            System.out.println("Student with ID " + id + " not found!");
	        }

	        tx.commit();
	        session.close();
	    }

	    // DELETE
	    public static void deleteStudent(int id) {
	        Session session = userService.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();

	        Student student = session.get(Student.class, id);
	        if (student != null) {
	            session.delete(student);
	            System.out.println("Deleted Student: " + student);
	        } else {
	            System.out.println("Student with ID " + id + " not found!");
	        }

	        tx.commit();
	        session.close();
	    }
	}
