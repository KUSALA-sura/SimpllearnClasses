package com.simplelearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KushiDemo2  extends HttpServlet {
	
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			
			//add the code to app
			out.print("<html><body>");
			out.print("<h1>Welcome to HttServelt  App </h1>");
			out.print("</html></body>");
			System.out.println("The requeset HtppSservlet completed");
		}

}
