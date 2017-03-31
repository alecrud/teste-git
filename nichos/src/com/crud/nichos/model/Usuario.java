package com.crud.nichos.model;

public class Usuario {

	private String name;
	private String email;

	public Usuario() {
	}

	public Usuario(String name, String email) {
		this.name = name;
		this.setEmail(email);
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

	@Override
	public String toString() {
		return this.name;
	}
}
