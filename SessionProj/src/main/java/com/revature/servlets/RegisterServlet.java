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
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");

		System.out.println("register: " + username + " " + password);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HtmlTemplates.addBootstrapHeader(out);
		HtmlTemplates.bsBodyStart(out);

		UserService service = new UserService();
		if (password.equals(password2)) {
			if (service.checkUsernameAvailable(username)) {
				service.addUser(username, password);
				out.println("<h3 style='color:green'>Registered: " + username + "!</h3>");
			} else {
				out.println("<h3 style='color:red'>username '" + username + "' is not available</h3>");
			}
		} else {
			out.println("<h3 style='color:red'>passwords do not match</h3>");
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		HtmlTemplates.bsBodyEnd(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
