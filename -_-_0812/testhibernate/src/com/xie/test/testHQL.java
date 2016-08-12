package com.xie.test;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xie.pojos.Journal;
import com.xie.pojos.Student;

public class testHQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName("张三");
		s.setSname("危机");
		s.setPassword("123");
		s.setSchool("福建师范大学");
		s.setTel(123456);
		
		Date date=new Date();       //获取当前时间
		Journal j=new Journal();
		j.setDetail("sss");
		j.setTitel("www");
		j.setLtime(date);
		System.out.println(date);
		
		j.setStudent(s);
		s.getJournals().add(j);
		
		
        Session session=com.xie.factory.HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		
		try
		{	
		   session.save(s);		
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tran.rollback();
		}
		
		tran.commit();

	}

}
