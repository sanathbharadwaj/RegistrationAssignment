package com.nissan.training.advancedjava.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationService {

	public void insert(RegistrationBean bean)
	{
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    // loads mysql driver

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_registration", "root", "VarshaAnkur"); 

		    String query = "insert into test_user(name, email, mobile, password) values(?,?,?,?)";

		    PreparedStatement preparedStatement = con.prepareStatement(query); // generates sql query
		    
		    preparedStatement.setString(1, bean.getName());
		    preparedStatement.setString(2, bean.getEmail());
		    preparedStatement.setString(3, bean.getMobile());
		    preparedStatement.setString(4, bean.getPassword());

		    preparedStatement.executeUpdate(); // execute it on test database
		    System.out.println("Succesfully Registered");
		    preparedStatement.close();
		    con.close();
		   } catch (SQLException | ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
	}

}
