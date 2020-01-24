package com.pioneercoders.servletrequestexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequestEx
 */
public class ServletRequestEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletRequestEx() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * True job of a Servlet is to handle client request. Servlet API provides two important interfaces javax.servlet.ServletRequest and javax.servlet.http.HttpServletRequest to encapsulate client request. Implementation of these interfaces provide important information about client request to a servlet.
		 * ServletRequest inteface provides methods to gather information about the client like getParameter,getContentType

           // ServletRequest Interface  method are extends to HttpServletRequest interface 
            *let see how we are getting client information using request interface methods
            *
            *
            *--------------------------------------
            *Servlet API provides two important interfaces ServletResponse and HttpServletResponse to assist in sending response to client.
            *After recieving request from the client using ServletRequest to generate response and agian send back to the client to send the response we have to use ServletResponse 
            *ServletResponse methods inherit to HttpServletResponse 


            * 
		 */
		//following are the methods of servletrequest used get information about the servlet 
		PrintWriter out=response.getWriter();
		out.println("RequestURI :"+request.getRequestURI());
		out.println("ContextPath :"+request.getContextPath());
		out.println("ServletPath :"+request.getServletPath());
		out.println("PathInfo :"+request.getPathInfo());
		out.println("QueryString :"+request.getQueryString());
		
		
		
		//how to get the user request and how to generate response 
		//to see the request and response refer ServletResponseInterface project    how request and response is generating 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
