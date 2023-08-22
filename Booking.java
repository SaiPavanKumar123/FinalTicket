package com.ticket;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Booking
 */
@WebServlet("/Booking")
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("jkasfhseu");
		String from = request.getParameter("from");
		System.out.println(from);
		String to = request.getParameter("to");
		String train = request.getParameter("train");
		String clas = request.getParameter("clas");
		String date = request.getParameter("date");
		String[] name = request.getParameterValues("rowname");
		String[] gender = request.getParameterValues("rowgender");
		String[] age = request.getParameterValues("rowage");
		BookDAL bn = new BookDAL();
		Ticket myticket = bn.tpass(from, to, train, clas, date, name, gender, age);
		request.setAttribute("book", myticket);
		RequestDispatcher rd = request.getRequestDispatcher("/NewFile.jsp");
		rd.forward(request, response);

	}

}