package com.pioneercoders.servletconfigexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigEx
 */
public class ServletConfigEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * When the Web Container initializes a servlet, it creates a ServletConfig object for the servlet. ServletConfig object is used to pass information to a servlet during initialization by getting configuration information from web.xml(Deployment Descriptor).
		 
		 *   With in the Servlet we can access Servlet initialization parameters by using ServletConfig object.
		 *   during  servlet instantiation if any init parameters are there to give init parameters information  to the servlet we have to use ServletConfig
		 *       String getInitParameter(String name): returns a String value initialized parameter, or NULL if the parameter does not exist.
                 Enumeration getInitParameterNames(): returns the names of the servlet's initialization parameters as an Enumeration of String objects, or an empty Enumeration if the servlet has no initialization parameters.
                 ServletContext getServletContext(): returns a reference to the ServletContext
                 String getServletName(): returns the name of the servlet instance

		 */
		//by using servlet config we get the servlet information like servlet and init parameters 
	   ServletConfig cfg= getServletConfig();
	   cfg.getInitParameter("email");
	   String servletname= getServletName();
	   PrintWriter out = response.getWriter();
	   out.println("Servletname"+servletname);
	   out.println(cfg.getInitParameter("email"));
	   System.out.println("Servlet name"+"  "+servletname);
	   System.out.println("Init values "+"   "+cfg.getInitParameter("email"));
	} 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
