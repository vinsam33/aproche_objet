package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Hall  {
	private int capacity;
<<<<<<< HEAD
=======
	private boolean confinement;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
	private Map<Calendar,Integer> date = new HashMap<>();
	private UUID id;
	
	private List<Event> events = new ArrayList<>();
	
	
	//reste horaire et liste d'évenements 
	
	public Hall(int capacity ,Map<Calendar,Integer>opendates) {
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


	
	
	
	
	
}
