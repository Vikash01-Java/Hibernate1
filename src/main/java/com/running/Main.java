package com.running;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.running.entity.Worker;

public class Main {
//3
	 static Metadata meta=null;
	static {

		 meta = new MetadataSources( new StandardServiceRegistryBuilder().configure().build()).getMetadataBuilder().build();
			
	}
	
//4
//	static Metadata meta=null;
//	public static Metadata getInstance(){
//
//		 return new MetadataSources( new StandardServiceRegistryBuilder().configure().build()).getMetadataBuilder().build();
//			
//	}
	
//6
	
//	static Metadata meta=null;
//	public static SessionFactory getInstance(){
//
//		 return new MetadataSources( new StandardServiceRegistryBuilder().configure().build())
//		 .getMetadataBuilder().build().buildSessionFactory();
//			
//	}
	
	//6
	
//	static Metadata meta=null;
//	public static SessionFactory getSessionFactory(){
//
//		 return new MetadataSources( new StandardServiceRegistryBuilder().configure().build())
//		 .getMetadataBuilder().build().buildSessionFactory();
//			
//	}
//
public static void main(String[] args) {
//1
		Worker w = new Worker("Saloni","female",59999);
		
//        Configuration cfg = new Configuration().configure();
//		
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(w);
//		tx.commit();
		
////2	deprecated
//		SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(w);
//		tx.commit();
		
//3		
//////		  Configuration cfg = new Configuration().configure();
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		 meta = new MetadataSources(ssr).getMetadataBuilder().build();

	
			SessionFactory sessionFactory = meta.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(w);
			tx.commit();	
		
//4		
//		SessionFactory sessionFactory = getInstance().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(w);
//		tx.commit();	
		
//5		SessionFactory sessionFactory = getInstance();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(w);
//		tx.commit();	
		
		
//6
		
	
//			SessionFactory sessionFactory = getSessionFactory();
//			
//			Session session = sessionFactory.openSession();
//			Transaction tx = session.beginTransaction();
//			session.persist(w);
//			tx.commit();	

		
		
		
		
		

		
	}

}
