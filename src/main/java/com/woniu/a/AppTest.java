package com.woniu.a;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

public class AppTest {
	@Test
	public void testName() throws Exception {
		Session s = HibernateUtils.openSession();
		s.beginTransaction();
		
		Dept d = new Dept();
		d.setDname("研发部");
	
		
		Emp e = new Emp();
		e.setEname("张三");
		e.setHiredate(new Date());
		e.setSal(213d);
		
		Emp e2 = new Emp();
		e2.setEname("李四");
		e2.setHiredate(new Date());
		e2.setSal(213d);
		
		d.getEmps().add(e);
		d.getEmps().add(e2);
		
		s.save(e);
		s.save(e2);
		s.save(d);
		s.getTransaction().commit();
		s.close();
		
	}
}
