package com.pioneercoders.requestdispatcherexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherEx
 */
public class RequestDispatcherEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDispatcherEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//if we dont mention any method in the form while submiting the form by default it goes to doGet method in servlet 
		
	    /*RequestDispatcher is an interface, implementation of which defines an object which can dispatch request to any resources(such as HTML, Image, JSP, Servlet) on the server.

Methods of RequestDispatcher

RequestDispatcher interface provides two important methods

Methods	Description
void forward(ServletRequest request, ServletResponse response)	forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server
void include(ServletRequest request, ServletResponse response)	includes the content of a resource (servlet, JSP page, HTML file) in the response
How to get an Object of RequestDispatcher

getRequestDispatcher() method of ServletRequest returns the object of RequestDispatcher.

RequestDispatcher rs = request.getRequestDispatcher("form.jsp");
rs.forward(request,response);
	     * 
	     */
		/*In this example, we will show you how RequestDispatcher is used to forward or include response of a resource in a Servlet. Here we are using form.jsp to get id and name from the user, RequestDispatcherEx Servlet will validate the name entered by the user, if the user has entered "srinadh" as password, then he will be forwarded to Welcome Servlet else the user will stay on the form.jsp page and an error message will be displayed.
	   
	   *
	   *
	   */
	
	
	//after submitting the form the request comes to RequestDispatcherEx get the id and name and validate if user enter the name srinadh ,name matches then he will be redirected WelcomeServlet and gives success response otherwise he will redirected to form.jsp with error message 
	
	   String id= request.getParameter("id");
	   String name = request.getParameter("name");
	   if(name.equals("srinadh")){
		   //if name equal to srinadh then forwarding the resource or request to Welcome Servlet to give success response 
		   request.getRequestDispatcher("WelcomeMessage").forward(request, response);
	   }else
       {
		   //user entered does not match with srinadh then again forward to form.jsp and print error msg 
		   PrintWriter out= response.getWriter();
		   out.println("<font color='red'><b>You have entered incorrect password</b></font>");
             request.getRequestDispatcher("index.html");  
       }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
