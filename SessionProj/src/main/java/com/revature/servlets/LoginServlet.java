package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.UserService;
import com.revature.utils.HtmlTemplates;

/**
 * Servlet implementation class RegisterServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");


		//System.out.println(username + " " + password); 
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HtmlTemplates.addBootstrapHeader(out);
		HtmlTemplates.bsBodyStart(out);
		
		HttpSession session = request.getSession();
		
		//System.out.println("validating...");
		
		if(new UserService().validateLogin(username, password) == 1) {
			session.setAttribute("username", username);
			out.println("<h3 style='color:green'>USER: " + username + " Logged In!</h3>");
			
		}else {
			out.println("<h3 style='color:red'>failed to login user: " + username + "..</h3>");
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HtmlTemplates.bsBodyEnd(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
