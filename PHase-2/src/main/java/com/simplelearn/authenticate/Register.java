package com.simplelearn.authenticate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register  extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	{		response.setContentType("text/html");		
	//response.sendRedirect("login.html");		
	request.getRequestDispatcher("index.jsp").include(request, response);
		request.getRequestDispatcher("register.html").include(request, response);
	}
	
	
	
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
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
		
		
		
		
		
		//System.out.println(useremail);
		//System.out.println(userpassword);
		
		
	}

}

