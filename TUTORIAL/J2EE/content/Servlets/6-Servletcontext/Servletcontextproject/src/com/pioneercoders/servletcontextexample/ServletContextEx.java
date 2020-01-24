package com.pioneercoders.servletcontextexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextEx
 */
public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//if we want to get any init parameters for any servlet while loading we should go for init parameters using servletconfig 
				//but we want any parameters common to all servlets and jsps we have to get from web.xml the solution is context-param using servletcontext
				//For every Web application a ServletContext object is created by the web container. ServletContext object is used to get configuration information from Deployment Descriptor(web.xml) which will be available to any servlet or JSPs that are part of the web app.
			
			   //context parameters available to every servlet 
				//ex: jdbc details are required for common for  every servlet so that we have to keep in context-param in web.xml 
				//we can context param values either by servletconfig or servletcontext 
				/*ServletContext app = getServletContext();
				OR
				ServletContext app = getServletConfig().getServletContext();
			     */
				/*methods 
				 *  Object getAttribute(String name)	returns the container attribute with the given name, or NULL if there is no attribute by that name.
		         String getInitParameter(String name)	returns parameter value for the specified parameter name, or NULL if the parameter does not exist
		           Enumeration getInitParameterNames()	returns the names of the context's initialization parameters as an Enumeration of String objects
		          void setAttribute(String name,Object obj)	set an object with the given attribute name in the application scope
		          void removeAttribute(String name)	removes the attribute with the specified name from the application context

				 * 
				 */
				
				
			    ServletContext context = getServletContext();
			   PrintWriter out= response.getWriter();
			   out.println("ServletContext available  parameters are "+  "  "+context.getInitParameter("jdbc"));
			   System.out.println(context.getInitParameter("jdbc"));
			   
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
