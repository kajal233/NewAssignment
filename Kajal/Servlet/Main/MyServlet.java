package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter(); // io package
		
		int a=10;
		int b=20;
		int c=a+b;
		//jdbc
		

		out.print("<html>");
		out.print("<body bgcolor='pink'");

	     String name="Joyti";
		
		out.print("<h1>hello world , my name is </h1>"+name);
		
		out.print("<h1>Sum of two numis </h1>"+c);

	
		out.print("</body");
		out.print("</html>");

		out.close();

	}

}
