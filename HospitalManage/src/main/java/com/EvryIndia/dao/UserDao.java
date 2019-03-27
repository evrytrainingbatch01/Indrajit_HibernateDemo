package com.EvryIndia.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EvryIndia.domain.User;

public class UserDao {
	public void addUserDetails(String patientId, String patientName, String age, String bloodGroup,String checkUp,String doctors,String testRecommended ) {
        try {
     
            Configuration configuration = new Configuration().configure("com.EvryIndia.cfg.hibernate.cfg.xml");
 
            
            SessionFactory sessionFactory = configuration.buildSessionFactory();
 
            
            Session session = sessionFactory.openSession();
 
            
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setPatientId(patientId);
            user.setPatientName(patientName);
            user.setAge(age);
            user.setBloodGroup(bloodGroup);
            user.setCheckUp(checkUp);
            user.setDoctors(doctors);
            user.setTestRecommended(testRecommended);
            
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
 
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }
}
