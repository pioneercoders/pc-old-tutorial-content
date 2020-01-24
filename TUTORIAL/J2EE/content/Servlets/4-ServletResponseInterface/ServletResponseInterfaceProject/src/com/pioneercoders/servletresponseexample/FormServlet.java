package com.pioneercoders.servletresponseexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// TODO Auto-generated method stub
				//user always sends with url pattern mapping only ,we are hiding internal details of our application 
				//see web.xml for url pattern 
				 //<url-pattern>/FormServlet</url-pattern>
				//url pattern may be anything 
			
				//form.jsp user hits the submit button action ="FormServlet" tomcat checks is there any urlpattern available with this name and sends the request to FormServlet ,FormServlet recieve the client data and generate response 
			
			    //if url pattern is not matching we will get 404 error 
				//by request methods we recieve client data 
				
			
			//user always enters string data only  
				  //taking the input field values based on name attribute in html 
			  String user = request.getParameter("user");
			  String pass= request.getParameter("pass");
			  
			  //after recieving client information we have to send the response using httpservletresponse 
			 //im sending text as response 
			  response.setContentType("text");
			  //to send the response to the user 
			  //im sending the response to the user  with his username and password 
			  PrintWriter out = response.getWriter();
			  out.println("PathInfo :"+request.getPathInfo());
				out.println("QueryString :"+request.getQueryString());
			  out.println("User credentials are "+"  "+user+" "+pass);
			   String name= getServletName();
			   System.out.println(name);
			}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
