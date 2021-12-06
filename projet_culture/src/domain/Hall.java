package domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Hall extends Event {
	private int capacity;
	private Date date;
	private int id;
	private int genid  = 0;
	
	private HashMap<Date, Event> events;
	
	
	//reste horaire et liste d'évenements 
	
	public Hall(int capacity, Date date ,List<OpenDate>opendates) {
		super(capacity);
		this.date = date;
		this.id = genid++;
	}

	public Date getDate() {
		return date;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getId() {
		return id;
	}


	
	
	
	
	
}
