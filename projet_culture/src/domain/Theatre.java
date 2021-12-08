package domain;

import java.util.Calendar;
import java.util.List;

public class Theatre extends Event {

	private final String name;

	private Calendar datestart;
	private Calendar dateend;

	public Theatre(List<Calendar> dates, String name, int capacity, int duration) {
		super(capacity, dates, duration);

		this.name = name;

	}

	public Calendar getDatestart() {
		return datestart;
	}

	public Calendar getDateend() {
		return dateend;
	}

	public String getName() {
		return name;
	}

}
