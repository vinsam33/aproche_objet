package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Event {
	private int capacity;
	private List<Calendar> dates ;
	private int duration;
	
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

}
