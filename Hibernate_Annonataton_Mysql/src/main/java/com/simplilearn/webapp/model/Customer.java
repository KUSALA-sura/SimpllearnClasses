package com.simplilearn.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_data")

public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="pid")
	private int pid;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="phoneno")
	private String phoneno;
	
	
	
	public Customer() {
		super();
	}
	public Customer(int id) {
		super();
		this.id = id;
	}
	public Customer(int id, String name, String email, String pname, int pid, String ad, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pname = pname;
		this.pid = pid;
		this.ad = ad;
		this.phoneno = phoneno;
	}
	public Customer(String name, String email, String pname, int pid, String ad, String phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.pname = pname;
		this.pid = pid;
		this.ad = ad;
		this.phoneno = phoneno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAd() {
		return ad;
	}
	public void setAdd(String ad) {
		this.ad = ad;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", pname=" + pname + ", pid=" + pid
				+ ", ad=" + ad + ", phoneno=" + phoneno + "]";
	}
	
	

}
