package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session= sfactory.openSession();
		session.beginTransaction();
		
		Student st =new Student(1,"anusha","anudamu007@gmail.com");
		session.update(st);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();

	}

}
