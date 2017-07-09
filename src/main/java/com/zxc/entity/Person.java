package com.zxc.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="person")
public class Person {
	private Integer id; //ID
	private String name; //name
	private String phone;
	private String address;
	
	@Id
	@Column(name="id", nullable=false, unique=true, length=32)
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@GeneratedValue(generator="generator")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name", nullable=false, length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="phone", nullable=false, length=32)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name="address", nullable=false, length=32)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
