package domain;

import java.util.Calendar;
import java.util.List;

public class Theatre extends Event {
	
	
	private final String name;

	
	public Theatre(List<Calendar>  dates,String name,int capacity,int duration) {
		super(capacity,dates,duration);
		this.name = name;
		
		
		
	}


	public String getName() {
		return name;
	}




	
}
