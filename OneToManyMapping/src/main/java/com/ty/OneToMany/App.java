package com.ty.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Person p=new Person();
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		
		List<Vehicle> list=new ArrayList<Vehicle>();
		list.add(v1);
		list.add(v2);
		p.setpId(101);
		p.setpName("raghu");
		p.setpContact(12667383l);
		p.setListVehicle(list);
		
		v1.setId(1);
		v1.setName("car");
		v1.setP(p);
		
		v2.setId(2);
		v2.setName("car");
		v2.setP(p);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Vehicle.class).addAnnotatedClass(Person.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(v1);
		session.save(v2);
		session.save(p);
		transaction.commit();
	}
}
