package com.simplilearn.webapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.webapp.model.Customer;
import com.simplilearn.webapp.util.HibernateSessionUtil;

@WebServlet("/add-customer")

public class AddCustomer extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("index.jsp").include(request, response);
		request.getRequestDispatcher("add-customer.html").include(request, response);
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//add top nav 
		request.getRequestDispatcher("index.jsp").include(request, response);
		
		// fetch data from form
				String customerName = request.getParameter("name");
				String customerEmail = request.getParameter("email");
				String customerproductName=request.getParameter("pname");
				int customerproductid=Integer.parseInt(request.getParameter("pid"));
				String customerAddress = request.getParameter("ad");
				String customerPhoneno = request.getParameter("phoneno");
				
				
				//try catch
				try
				{
				SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
				
				
				// 2. create session object
				Session session = factory.openSession();
				
				
				//3.craete customer object
				Customer customer=new Customer(customerName,customerEmail,customerproductName,customerproductid,customerAddress,customerPhoneno);
				
				// 4. begin transaction
				Transaction tx = session.beginTransaction();
				
				// 5. save product
				session.save(customer);
				
				// 6. commit transaction
				tx.commit();
				
				if(session != null ) {
					out.print("<h3 style='color:green'> Product is created sucessfully ! </h3>");
				}
			
				// 3. close session
				session.close();
				
				
				}catch(Exception e)
				{
					out.print("<h3 style='color:red'> Hibernate session is failed ! </h3>");
				}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
