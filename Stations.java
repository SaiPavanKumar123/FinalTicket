package com.ticket;

public class Stations {
	String from;
	String to;
	String Train;

	public Stations(String from, String to, String train) {
		super();
		this.from = from;
		this.to = to;
		Train = train;
	}

	public String getTrain() {
		return Train;
	}

	public void setTrain(String train) {
		Train = train;
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

}