package com.woniu.b;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Test;

public class AppTest {
	@Test
	public void testName() throws Exception {
		Session s = HibernateUtils.openSession();
		s.beginTransaction();
		
		Teacher t = new Teacher();
		t.setTname("高鹏");
		
		Student stu = new Student();
		stu.setSname("小李");
		Student stu2 = new Student();
		stu2.setSname("小陈");
		
		t.getStudents().add(stu);
		t.getStudents().add(stu2);
		
		s.save(stu);
		s.save(stu2);
		s.save(t);
		
		s.getTransaction().commit();
		s.close();
	}
}
