package com.subha.restwebservices.RestWebServices;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private Date date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(Integer i, String name, Date date) {
		super();
		this.id = i;
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", date=" + date + "]";
	}	
	
	
	
}
