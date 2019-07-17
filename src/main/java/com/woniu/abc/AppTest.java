package com.woniu.abc;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

public class AppTest {
	@Test
	public void testName() throws Exception {
		Session s = HibernateUtils.openSession();
		s.beginTransaction();
		
		User user = new User();
		user.setName("周杰伦");
		user.setBirthday(new Date());
		user.setMoney(1234d);
		user.setPhoto("1.jpg");
		
		user.getAddress().put("老家", "西安");
		user.getAddress().put("新家", "北京");
		user.getAddress().put("娘家", "安康");
//		user.getAddress().add("西安");
//		user.getAddress().add("北京");
//		user.getAddress().add("广州");
		s.save(user);
		
		s.getTransaction().commit();
		s.close();
	}
	@Test
	public void test1() throws Exception {
		Session s = HibernateUtils.openSession();
		s.beginTransaction();
		
		User user = s.get(User.class, 1);
		System.out.println(user);
		System.out.println(user.getAddress());
		
		s.getTransaction().commit();
		s.close();
	}
}
