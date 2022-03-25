package com.simplelearn.ecom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedBackPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");		
		//response.sendRedirect("register.html");		
		request.getRequestDispatcher("index.jsp").include(request, response);
			request.getRequestDispatcher("feedback.html").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String useremail1=request.getParameter("UserEmail");
		String username1=request.getParameter("UserName");
		String usercomment=request.getParameter("comment");
				
		
		
		if(useremail1.equals("")  ||  username1.equals("") || usercomment.equals(""))
		{
			out.println("<h1 style='color:red '>fEEGbACK Failed ! ** Required filed is missing </h1>");
		}
		
		else
		{
			out.println("<h1 style='color:green '>SccessFULL </h1>");
		}
	}

}
