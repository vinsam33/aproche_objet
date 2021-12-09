package domain;

import java.util.Calendar;
import java.util.List;

public abstract class Event {

	private final int capacity;
	private final List<Calendar> dates;
	private final int duration;
	private final String name;

	public Event(String name, int capacity, List<Calendar> dates, int duration) {
		this.capacity = capacity;
		this.dates = dates;
		this.duration = duration;
		this.name = name;
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

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + "]";
	}

}
