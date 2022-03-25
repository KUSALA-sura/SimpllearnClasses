package com.simplelearn.authenticate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FeedBack  extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		//response.sendRedirect("feedback.html");
		request.getRequestDispatcher("index.jsp").include(request, response);
		request.getRequestDispatcher("feedback.html").include(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
	{
		
		
		
		response.setContentType("text/html");
		PrintWriter out1=response.getWriter();
		
		
		String username=request.getParameter("fulllName");
		String Email=request.getParameter("email");
		String Comments=request.getParameter("comments");
		
		
		if(username.equals("")   || Email.equals("") || Comments.equals(""))
		{
			out1.println("<h1 style='color:red'>FeedBack Failed Submited please fill Required fileds </h1>");
		}
		else
		{
			out1.println("<h1 style='color:green'>SuccesFullay Submited The feedback "+username+" </h1>");
		}
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
