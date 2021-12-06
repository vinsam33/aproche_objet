package domain;

import java.time.LocalDate;
import java.util.Date;

public class Theatre extends Event {
	
	
	private LocalDate  datestart;
	private LocalDate  dateend;
	private String name;

	
	public Theatre(LocalDate  datestart,LocalDate  dateend,String name,int capacity) {
		super(capacity);
		this.datestart = datestart;
		this.dateend = dateend;
		this.name = name;
		
		
		
	}

	public LocalDate getDatestart() {
		return datestart;
	}

	public LocalDate getDateend() {
		return dateend;
	}

	public String getName() {
		return name;
	}




	
}
