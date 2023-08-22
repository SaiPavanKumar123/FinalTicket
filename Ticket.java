package com.ticket;

import java.util.ArrayList;

public class Ticket {
	String from, to, train, clas, date;
	ArrayList<Passenger> pas = new ArrayList<>();

	public Ticket(String from, String to, String train, String clas, String date, ArrayList<Passenger> pas) {
		super();
		this.from = from;
		this.to = to;
		this.train = train;
		this.clas = clas;
		this.date = date;
		this.pas = pas;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public ArrayList<Passenger> getPas() {
		return pas;
	}

	public void setPas(ArrayList<Passenger> pas) {
		this.pas = pas;
	}

}