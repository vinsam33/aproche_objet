package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Event {
<<<<<<< HEAD
	private final int capacity;
	private final List<Calendar> dates ;
	private final  int duration;
=======
	private int capacity;
	private List<Calendar> dates ;
	private int duration;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
	
	public Event(int capacity, List<Calendar> dates,int duration) {
		this.capacity = capacity;
		this.dates = dates;
		this.duration = duration;
	}

	public List<Calendar> getDates() {
		return dates;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getDuration() {
		return duration;
	}



}
