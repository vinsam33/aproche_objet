package domain;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class City {
	private HallDisponibility hallDisponibility;
	private UUID id;

	private List<Hall> halls = new ArrayList<>();
	// private List<Boolean> weeksTaken = new ArrayList<>();

	public City() {
		this.id = UUID.randomUUID();

		Map<Calendar, Integer> dateh1 = new HashMap<>();
		dateh1.put(new GregorianCalendar(2021, 01, 01), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 05), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 13), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 22), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 28), 3);
		halls.add(new Hall(300, dateh1));

		Map<Calendar, Integer> dateh2 = new HashMap<>();
		dateh1.put(new GregorianCalendar(2021, 01, 02), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 04), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 12), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 21), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 27), 3);
		halls.add(new Hall(500, dateh2));

		Map<Calendar, Integer> dateh3 = new HashMap<>();
		dateh1.put(new GregorianCalendar(2021, 01, 03), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 06), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 14), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 23), 3);
		dateh1.put(new GregorianCalendar(2021, 01, 29), 3);
		halls.add(new Hall(1000, dateh3));

		hallDisponibility = new HallDisponibility(halls);

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

	public UUID getId() {
		return id;
	}

}
