package domain;

import java.util.Date;

public class Hall extends Event {
	private int capacity;
	private Date date;
	//reste horaire et liste d'évenements 
	
	public Hall(int capacity, Date date ) {
		super(capacity);
		this.date = date;
	}
	
	
}
