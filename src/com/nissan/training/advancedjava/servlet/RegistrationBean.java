package com.nissan.training.advancedjava.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.nissan.training.advancedjava.servlet.FieldsValidator.*;

public class RegistrationBean {

	private String name, email, mobile, password;
	
	
	public RegistrationBean(String name, String email, String mobile, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
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



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void validateFields() throws InvalidFieldException
	{
		if(!isNameValid(name))
			throw new InvalidFieldException("Please enter valid name");
		if(!isEmailValid(email))
			throw new InvalidFieldException("Please enter valid email");
		if(!isMobileValid(mobile))
			throw new InvalidFieldException("Please enter valid mobile");
		if(!isPasswordValid(password))
			throw new InvalidFieldException("Password - minimum 6 characters");
		
	}
}
