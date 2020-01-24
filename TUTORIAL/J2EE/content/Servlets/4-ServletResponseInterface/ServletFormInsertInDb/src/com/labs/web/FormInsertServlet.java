package com.labs.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.labs.dao.EmployeeDao;

/**
 * Servlet implementation class FormInsertServlet
 */
public class FormInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	    //read the parameters from index.jsp form 
		//request is to get the parameters from user 
		//response to generate response for the user request and again send back to user 
		//we can get the parameters one by one using request.getParameter()
		//here 'id' is name attribute value in index.jsp form (name="id")
		
		String id1= request.getParameter("id");
		//User always enters data in String format only to insert integer value in db we have to convert String format to integer by using parseInt() method  
		 int id= Integer.parseInt(id1);
		 String empname= request.getParameter("empname");
	     String dob= request.getParameter("dob");
	     String emailid= request.getParameter("emailid");
	     String phno= request.getParameter("phoneno");
	     int phoneno= Integer.parseInt(phno);
	     
	     //after reading all parameters from the form to insert into DB call EmployeeDao(insertEmpInfo) method and pass the parameters
	      EmployeeDao edao = new EmployeeDao();
	      try {
	    	 /* before going into the database and check whether data is inserted or not ,jdbc provide convenient  methods to know data is inserted or not
	    	  *  for DMl operations (insert,update,delete) method is executeUpdate() if data is inserted,updated,deleted we dont go to check in db 
	    	  for insert,update,delete its return type is int if data(one row ) is inserted in db it returns integer value as one */
			int inserted= edao.insertEmpInfo(id, empname, dob, emailid, phoneno);
			if(inserted>0){
				//im generating response to the user after recieving paramenters of index.jsp 
				//By using PrintWriter im generating response to the user (user means Browser)
				PrintWriter out= response.getWriter();
				//by using out.write im sending data to user as response 
				out.write("Data inserted successfully"+"  "+inserted);
			   System.out.println("Data inserted successfully"+"  "+inserted);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
