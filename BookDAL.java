package com.ticket;

import java.util.ArrayList;

public class BookDAL {
	public Ticket tpass(String from, String to, String train, String clas, String date, String[] name, String[] gender,
			String[] age) {
		ArrayList<Passenger> passengers = new ArrayList<>();

		for (int i = 0; i < name.length; i++) {
			passengers.add(new Passenger(name[i], gender[i], age[i]));
		}
		Ticket t = new Ticket(from, to, train, clas, date, passengers);
		// System.out.println(t.toString());
		return t;
	}
}
