package com.pioneercoders.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ServletContext ctx = request.getServletContext();
			ctx.setAttribute("User", "Srinadh");
			String user = (String) ctx.getAttribute("User");
			ctx.removeAttribute("User");
			
			HttpSession session = request.getSession();
			session.invalidate();
			
			PrintWriter out = response.getWriter();
			out.write("Hi "+user);
			
	}
	
	/*
	 * when we run MyServlet  the below activities are performed by listeners 
	 * 
	 *  ServletRequest initialized. Remote IP=0:0:0:0:0:0:0:1
        ServletContext attribute added::{User,Srinadh}
        ServletContext attribute removed::{User,Srinadh}
        Session Created:: ID=1908DF2C57C37F41ECB34E3B44F54E69
        Session Destroyed:: ID=1908DF2C57C37F41ECB34E3B44F54E69
        ServletRequest destroyed. Remote IP=0:0:0:0:0:0:0:1

	 */

}
