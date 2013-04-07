package com.aj;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * User: az
 * Date: 4/6/13
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class SayHello extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
		PrintWriter output = response.getWriter();

		Locale locale = request.getLocale();
		String bundleName = "ash.rocks.messages";
		ResourceBundle resourceBundle = ResourceBundle.getBundle(bundleName, locale);

		final String greeting = resourceBundle.getString("greeting");
		output.append(greeting);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
		doPost(request, response);
	}
}
