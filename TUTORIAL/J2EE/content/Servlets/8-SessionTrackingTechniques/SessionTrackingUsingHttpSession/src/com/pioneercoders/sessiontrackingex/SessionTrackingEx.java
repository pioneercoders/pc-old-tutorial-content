package com.pioneercoders.sessiontrackingex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTrackingEx
 */
public class SessionTrackingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTrackingEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * We all know that HTTP is a stateless protocol. All requests and responses are independent. But sometimes you need to keep track of client's activity across multiple requests. For eg. When a User logs into your website, not matter on which web page he visits after logging in, his credentials will be with the server, until he logs out. So this is managed by creating a session.

           Session Management is a mechanism used by the Web container to store session information for a particular user. There are four different techniques used by Servlet application for session management. They are as follows:

           Cookies
           Hidden form field
           URL Rewriting
           HttpSession
           Session is used to store everything that we can get from the client from all the requests the client makes.
		 
		 * The basic concept behind session is, whenever a user starts using our application, we can save a unique identification information about him, in an object which is available throughout the application, until its destroyed. So wherever the user goes, we will always have his information and we can always manage which user is doing what. Whenever a user wants to exit from your application, destroy the object with his information.
		
		 *   we are discussing about httpsession 
		 *   
		 *   HttpSession object is used to store entire session with a specific client. We can store, retrieve and remove attribute from HttpSession object. Any servlet can have access to HttpSession object throughout the getSession() method of the HttpServletRequest object.
		 *  
		 *  On client's first request, the Web Container generates a unique session ID and gives it back to the client with response. This is a temporary session created by web container.
The client sends back the session ID with each request. Making it easier for the web container to identify where the request is coming from.
The Web Container uses this ID, finds the matching session with the ID and associates the session with the request.
		 */
		//how to get a httpsession 
		//HttpSession session = request.getSession();
		//getSession() method returns a session if the session already  exist it return the existing session else create a new session 
		
	//u can see session example in below post method  
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		System.out.println("hiiiiii");
		String name = request.getParameter("user");
		String pass= request.getParameter("pass");
		//to store the user credentials http protocol doesn't remember the client data we have to store by using httpsession 
		//user clicks the submit button by submitting the form with details in session.jsp 
		//if password matches create the session and store user name 
		//and send session data available to other Servlet  also
		if(pass.equals("sri")){
			 //creating a session
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            //if password matches,  user  name available with in the session until logged out of the application we have to show his username 
			response.sendRedirect("SessionEx");
		
		
		
	}
	}

}
