package com.vertical.sudhir.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String password;
	@NotBlank(message = "Email is Required field...")
	private String email;
	private Double salary;
	
	 public User() {
	}
	
	public User(String name, String password, String email, Double salary) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
	}
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final Double getSalary() {
		return salary;
	}
	public final void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
