package com.ticket;

import java.io.IOException;
import java.sql.SQLException;

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

		String from = request.getParameter("from");

		String to = request.getParameter("to");
		String train = request.getParameter("train");
		String clas = request.getParameter("clas");
		String date = request.getParameter("date");

		String[] name = request.getParameterValues("name");
		String[] gender = request.getParameterValues("gender");
		String[] age = request.getParameterValues("age");
		BookDAL bn = new BookDAL();
		Ticket myticket = bn.tpass(from, to, train, clas, date, name, gender, age);
		request.setAttribute("book", myticket);
		JDBC j = new JDBC();
		try {
			j.insert(from, to, train, clas, date, myticket.getPassengers());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/final.jsp");
		rd.forward(request, response);
	}
}