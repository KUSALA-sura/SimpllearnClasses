package com.simplelearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class KushiDemo implements Servlet{
	ServletConfig config=null;

	public void init(ServletConfig config) throws ServletException {
		
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("The imlemeted method ");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		//add the code to app
		out.print("<html><body>");
		out.print("<h1>Welcome to Kushi App </h1>");
		out.print("</html></body>");
		
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "the methods ";
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("The imlemeted destoryed  method ");
		
	}

}
