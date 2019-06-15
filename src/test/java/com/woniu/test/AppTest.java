package com.woniu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.woniu.web.bean.User;
import com.woniu.web.dao.IUserDao;
import com.woniu.web.dao.impl.UserDaoImpl;

public class AppTest {
	@Test
	public void test1() throws Exception {
		IUserDao ud = new UserDaoImpl();
		User user = new User();
		user.setName("娇娇12345");
		Date date = new Date(2019-1900,7-1,27);
		user.setBrithday(date);
		user.setMoney(200.0);
		user.setPhoto("123");
		
		IUserDao proxy = (IUserDao) Proxy.newProxyInstance(AppTest.class.getClassLoader(), ud.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if("save".equals(method.getName())) {
					User user = (User) args[0];
					if(user.getName().length() < 5) {
						method.invoke(ud, args);
					}
				}
				return null;
			}
		});
		
		proxy.save(user);
		
		
		
		
		
//		user.setId(184);
		
//		ud.update(user);
//		ud.save(user);
//		ud.delete(185);
		
//		List<User> list = ud.find();
//		for (User user : list) {
//			System.out.println(user);
//		}
	}
}
