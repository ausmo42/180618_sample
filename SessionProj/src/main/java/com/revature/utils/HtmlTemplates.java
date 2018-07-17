package com.revature.utils;

import java.io.PrintWriter;

public class HtmlTemplates {

	public static void goBackButton(PrintWriter out) {
		out.println("<hr><input type='button' value='GO BACK' onclick='goBack()'>"
				+ "<script>function goBack(){window.history.back();}</script>");
	}

	public static void addBootstrapHeader(PrintWriter out) {
		out.println("<head>\r\n" + 
				"<!-- THIS IS AN HTML COMMENT\r\n" + 
				"	HTML documents will always have a root tag of 'html'.\r\n" + 
				"	They will also have a <head> and <body> tag.-->\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"	<!-- The meta charset tag will determine how many character types are supported\r\n" + 
				"	on your browser. UTF-8, for the most part, allows ANY language. -->\r\n" + 
				"\r\n" + 
				"<!-- We are bring in bootstrap via a CDN (Content Delivery Network)\r\n" + 
				"	These networks let use utilize libraries over the net as opposed to \r\n" + 
				"	downloading locally and using them. -->\r\n" + 
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n" + 
				"<!-- Bring Bootstrap 3 libraries -->\r\n" + 
				"\r\n" + 
				"<script src=\"http://code.jquery.com/jquery-3.3.1.min.js\" integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\" crossorigin=\"anonymous\"></script>\r\n" + 
				"\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n" + 
				"<!-- Bring in supplemental javascript for bootstrap -->\r\n" + 
				"\r\n" + 
				"<title>Welcome To My Webpage</title>\r\n" + 
				"	<!-- The title tag will label a page with an identifying title. This is mostly\r\n" + 
				"	seen in the tab itself on most browsers. -->\r\n" + 
				"	\r\n" + 
				"	<!-- The <head> tag is used to store metadata about the page, such as,\r\n" + 
				"			page title, or charset encodings. -->\r\n" + 
				"			\r\n" + 
				"	<style>\r\n" + 
				"		/*This is a block of css code!\r\n" + 
				"			This is also called internal stylesheet.\r\n" + 
				"		*/\r\n" + 
				"		li i {\r\n" + 
				"			color:blue;\r\n" + 
				"		}\r\n" + 
				"		\r\n" + 
				"	</style>\r\n" + 
				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"./resources/css/main.css\">\r\n" + 
				"</head>");
	}

	public static void bsBodyStart(PrintWriter out) {
		out.println("<body style=\"background-color: #444650\">");
		addNavBar("Menu", out);
		

	}

	public static void addNavBar(String title, PrintWriter out) {
		out.println("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n" + 
				"	  <!-- Brand -->\r\n" + 
				"	  <a class=\"navbar-brand\" href=\"index.html\">" + title + "</a>\r\n" + 
				"	\r\n" + 
				"	  <!-- Links -->\r\n" + 
				"	  <ul class=\"navbar-nav\">\r\n" + 
				"	    <li class=\"nav-item\">\r\n" + 
				"	      <a class=\"nav-link\" href=\"index.html\">HOME</a>\r\n" + 
				"	    </li>\r\n" + 
				"	\r\n" + 
				"	    <!-- Dropdown -->\r\n" + 
				"	    <li class=\"nav-item dropdown\">\r\n" + 
				"	      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n" + 
				"	        CSS REFERENCES\r\n" + 
				"	      </a>\r\n" + 
				"	      <div class=\"dropdown-menu\">\r\n" + 
				"	        <a class=\"dropdown-item\" href=\"https://www.w3schools.com/bootstrap4/default.asp\">BOOTSTRAP 4</a>\r\n" + 
				"	        <a class=\"dropdown-item\" href=\"https://www.w3schools.com/bootstrap4/bootstrap_navbar.asp\">NAV BARS</a>\r\n" + 
				"	        <a class=\"dropdown-item\" href=\"https://www.w3schools.com/cssref/css_selectors.asp\">CSS REFERENCES</a>\r\n" + 
				"	      </div>\r\n" + 
				"	    </li>\r\n" + 
				"			<li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> EXAMPLE LINKS </a>\r\n" + 
				"				<div class=\"dropdown-menu\">\r\n" + 
				"					<a class=\"dropdown-item\" href=\"./forms.html\">FORMS</a> \r\n" + 
				"				</div></li>\r\n" + 
				"	  </ul>\r\n" + 
				"	</nav>");
		
		out.println("<div class=\"container-fluid\">");
	}

	public static void bsBodyEnd(PrintWriter out) {
		out.println("</div>" + "</body>");
	}

}
