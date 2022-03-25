package com.simplelearn.ecom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		//response.sendRedirect("register.html");		
		request.getRequestDispatcher("index.jsp").include(request, response);
			request.getRequestDispatcher("register.html").include(request, response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String useremail=request.getParameter("UserEmail");
		String userpassword=request.getParameter("UserPassword");
		String username=request.getParameter("UserName");
		String usercnfpassword=request.getParameter("cnfpassword");
		
		
		if(username.equals("")||    useremail.equals("")  ||  userpassword.equals("") || usercnfpassword.equals(""))
		{
			out.println("<h1 style='color:red '>Register Failed ! ** Required filed is missing </h1>");
		}
		else
			if( userpassword.equals(usercnfpassword))
		{
				out.println("<h1 style='color:green '>Register Scessfully ! **"+username+  "</h1>");
		}
		else
		{
			out.println("<h1 style='color:red '>Register Failed ! ** Creadentails are Invalid </h1>");
		}
		
		
		
	}

}
