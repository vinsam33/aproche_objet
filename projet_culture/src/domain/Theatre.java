package domain;

import java.util.Date;

public class Theatre extends Event {
	
	
	private Date date;
	private String name;
	
	public Theatre(Date date,String name,int capacity) {
		super(capacity);
		this.date = date;
		this.name = name;
		
	}

	public Date getDate() {
		return date;
	}

	public String getName() {
		return name;
	}
	
}
