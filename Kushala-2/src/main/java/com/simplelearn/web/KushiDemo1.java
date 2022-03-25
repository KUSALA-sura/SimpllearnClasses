package com.simplelearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class KushiDemo1 extends GenericServlet  {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		//add the code to app
		out.print("<html><body>");
		out.print("<h1>Welcome toGeneric  App </h1>");
		out.print("</html></body>");
		System.out.println("The reqpese completed");
		
	}

}
