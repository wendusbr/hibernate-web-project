package com.devmedia.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  
  public static Session getCurrentSession() {
	  // SessionFactory in Hibernate 5 example
	  Configuration config = new Configuration();
	  config.configure();
	  // local SessionFactory bean created
	  SessionFactory sessionFactory = config.buildSessionFactory();
	  Session session = sessionFactory.getCurrentSession();
	  
	  return session;
  }
}