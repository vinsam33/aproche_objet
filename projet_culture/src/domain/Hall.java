package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Hall {
	private int capacity;
	private Map<Calendar, Integer> date = new HashMap<>();
	private final UUID id;

	private List<Event> events = new ArrayList<>();

	public Hall(int capacity, Map<Calendar, Integer> opendates) {
		this.id = UUID.randomUUID();
		this.date = opendates;
	}

	public Set<Calendar> getDate() {
		return date.keySet();
	}

	public int getCapacity() {
		return capacity;
	}

	public int getDuration(Calendar cal) {
		return date.get(cal);
	}

	public UUID getId() {
		return id;
	}

	public void addEvent(Event event) {
		events.add(event);

	}
	
	public void displayEvents() {
		for (Event e : events) {
			System.out.println(e.toString());
		}
	}

}
