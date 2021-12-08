package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Event {
	private final int capacity;
	private final List<Calendar> dates ;
	private final  int duration;
	
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
