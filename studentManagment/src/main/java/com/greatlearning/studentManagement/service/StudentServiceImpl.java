package com.greatlearning.studentManagement.service;

import org.springframework.stereotype.Repository;

import com.greatlearning.studentManagement.entity.Student;

import javaz.transaction.Transactionl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


@Repository
public class StudentServiceImpl implements StudentService {
	
	private SessionFactory sessionFactory;
	
	private Session session;
	
	@Autowired
	StudentServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
		try {
			session = sessionFactory.getCurrentSession();
			
		}
		catch(HibernateException e) {
			session = sessionFactory.openSession();
			
		}
	}
@Transactional	
public List<Student> findAll() {
	Trasaction tx = session.beginTransaction();
	List<Student> students.session.createQuery("from student").list();
	tx.commit();
	return students;
}

	public Student findById(int id) {
		Transaction tx = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		tx.commit();
		return student;

		
		
		
				
	}
	public void save( Student student) {
		Trasaction tx = session.beginTransaction();
		
		session.saveOrUpdate(student);
		
		tx.commit();
		
	}
	public void deleteById(int id) {
		
		Transaction tx = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		session.delete(student);
		
		tx.commit();
		
		
	}
}