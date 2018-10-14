package com.nissan.training.advancedjava.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.nissan.training.advancedjava.servlet.FieldsValidator.*;

public class RegistrationModel {

	private String name, email, mobile, password;
	
	
	public RegistrationModel(String name, String email, String mobile, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}



	public void insert()
	{
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    // loads mysql driver

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_registration", "root", "VarshaAnkur"); 

		    String query = "insert into test_user(name, email, mobile, password) values(?,?,?,?)";

		    PreparedStatement ps = con.prepareStatement(query); // generates sql query

		    ps.setString(1, name);
		    ps.setString(2, email);
		    ps.setString(3, mobile);
		    ps.setString(4,  password);

		    ps.executeUpdate(); // execute it on test database
		    System.out.println("Succesfully Registered");
		    ps.close();
		    con.close();
		   } catch (SQLException | ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
	}
	
	public void validateFields() throws InvalidFieldException
	{
		if(!isNameValid(name))
			throw new InvalidFieldException("Please enter valid name");
		if(!isEmailValid(email))
			throw new InvalidFieldException("Please enter valid email");
		if(!isEmailValid(mobile))
			throw new InvalidFieldException("Please enter valid mobile");
		if(!isEmailValid(password))
			throw new InvalidFieldException("Password - minimum 6 characters");
		
	}
}
