package domain;

import java.util.Calendar;
import java.util.List;

public class Concert extends Event {

	public Concert(List<Calendar> dates, String groupes_name, int capacity, int duration) {
		super(groupes_name, capacity, dates, duration);
	}

}
