package domain;

import java.util.Calendar;
import java.util.List;

public class Theatre extends Event {
	
	
<<<<<<< HEAD
	private final String name;
=======
	private Calendar  datestart;
	private Calendar  dateend;
	private String name;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023

	
	public Theatre(List<Calendar>  dates,String name,int capacity,int duration) {
		super(capacity,dates,duration);
<<<<<<< HEAD
=======
		this.datestart = datestart;
		this.dateend = dateend;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
		this.name = name;
		
		
		
	}

<<<<<<< HEAD
=======
	public Calendar getDatestart() {
		return datestart;
	}

	public Calendar getDateend() {
		return dateend;
	}
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023

	public String getName() {
		return name;
	}




	
}
