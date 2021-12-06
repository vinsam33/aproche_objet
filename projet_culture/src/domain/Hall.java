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
	private boolean confinement;
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

	public UUID getId() {
		return id;
	}


	
	
	
	
	
}
