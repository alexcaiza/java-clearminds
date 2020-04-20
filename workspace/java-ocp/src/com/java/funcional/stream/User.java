package com.java.funcional.stream;

public class User {
	
	public String username;
	public Integer age;
	
	public User(String nombre, Integer edad) {
		this.username = nombre;
		this.age = edad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
