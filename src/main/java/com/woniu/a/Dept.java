package com.woniu.a;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private Integer did;
	private String dname;
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	private Set<Emp> emps = new HashSet<>();
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
