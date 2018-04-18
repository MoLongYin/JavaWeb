package com.ssh.dao;

import com.ssh.entity.Students;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentsDao {
	private SessionFactory sessionFactory;
	private Session session;


	public StudentsDao(){
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public List<Students> getStu(){
		List<Students> lists = null;
		try {
			Query query = session.createQuery("from Students");
			lists = query.list();
		}catch (HibernateException e){
			e.printStackTrace();
		}
		return lists;
	}
}
