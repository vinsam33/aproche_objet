package domain;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class City {
	private HallDisponibility hallDisponibility;
	private UUID id;

	private List<Hall> halls = new ArrayList<>();
	// private List<Boolean> weeksTaken = new ArrayList<>();

	public City(List<Hall> halls ) {
		this.id = UUID.randomUUID();
		
	}
	public boolean attributeEvent(Event event) {
		Map<Integer, Map<Integer, List<Hall>>> halls = hallDisponibility.getHallsDisponibility();
		for (Calendar date : event.getDates()) {

			List<Hall> possibleHalls = halls.get(date.get(Calendar.WEEK_OF_YEAR)).get(date.get(Calendar.DAY_OF_WEEK));
			for (Hall h : possibleHalls) {
				if ((h.getCapacity() <= event.getCapacity()) && (event.getDuration() <= h.getDuration(date))) {
					h.addEvent(event);
					// weeksTaken.set(date.get(Calendar.WEEK_OF_YEAR), true);
					possibleHalls.remove(h);
					return true;
				}
			}
		}
		return false;

	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
