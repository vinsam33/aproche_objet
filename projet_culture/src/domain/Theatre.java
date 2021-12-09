package domain;

import java.util.Calendar;
import java.util.List;

public class Theatre extends Event {

	public Theatre(List<Calendar> dates, String name, int capacity, int duration) {
		super(name, capacity, dates, duration);

	}

}
