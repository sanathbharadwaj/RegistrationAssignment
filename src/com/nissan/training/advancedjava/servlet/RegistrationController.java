package com.nissan.training.advancedjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String name = request.getParameter("fullname");
		  String email = request.getParameter("email");
		  String mobile = request.getParameter("mobile");
		  String password = request.getParameter("password");
		  
		  RegistrationModel model = new RegistrationModel(name, email, mobile, password);
		  
		  try {
			model.validateFields();
		} catch (InvalidFieldException e) {
			System.out.println("Invalid field");
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			   out.println("<font color=red>"+ e.getMessage()+"</font>");
			   rd.include(request, response);
			   return;
		}
		  
		  model.insert();
		  
		  RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		  rd.forward(request, response);
		  
	}

}
