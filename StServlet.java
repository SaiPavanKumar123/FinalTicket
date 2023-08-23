package com.ticket;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

// import org.json.*;

/**
 * Servlet implementation class StServlet
 */
@WebServlet("/StServlet")
public class StServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONArray json = new JSONArray();

		try {
			JDBC connect = new JDBC();
			ArrayList<Stations> ar2 = connect.connection();
			for (Stations st : ar2) {
				JSONObject j = new JSONObject();
				j.put("from", st.getFrom());
				j.put("to", st.getTo());
				j.put("train", st.getTrain());
				json.put(j);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().write(json.toString());

	}

}