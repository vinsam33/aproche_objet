package domain;

import java.util.Calendar;
import java.util.List;

public class Concert extends Event {

	private String groupes_name;

	public Concert(List<Calendar> dates, String groupes_name, int capacity, int duration) {
		super(capacity, dates, duration);
		this.groupes_name = groupes_name;
	}

	public String getGroupes_name() {
		return groupes_name;
	}

	@Override
	public int getCapacity() {
		return super.getCapacity();
	}

}
