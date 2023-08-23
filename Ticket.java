package com.ticket;

import java.util.ArrayList;

public class Ticket {
	private String from;
	private String to;
	private String train;
	private String clas;
	private String date;
	private ArrayList<Passenger> passengers;

	public Ticket(String from, String to, String train, String clas, String date, ArrayList<Passenger> passengers) {
		this.from = from;
		this.to = to;
		this.train = train;
		this.clas = clas;
		this.date = date;
		this.passengers = passengers;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	// You might want to override toString() for debugging purposes
	@Override
	public String toString() {
		return "Ticket{" + "from='" + from + '\'' + ", to='" + to + '\'' + ", train='" + train + '\'' + ", clas='"
				+ clas + '\'' + ", date='" + date + '\'' + ", passengers=" + passengers + '}';
	}
}
