package com.woniu.abc;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {
	private Integer id; 
	private String name;
	private Date birthday; 
	private Double money; 
	private String photo;
	private Map<String,String> address = new HashMap<>() ;
	public Map<String,String> getAddress() {
		return address;
	}
	public void setAddress(Map<String,String> address) {
		this.address = address;
	}
	public User() {
		super();
	}
	public User(Integer id, String name, Date birthday, Double money, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.money = money;
		this.photo = photo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", money=" + money + ", photo=" + photo
				+ "]";
	}
	
}
