package domain;

import java.util.Calendar;
import java.util.List;

public class Concert extends Event{
	
	
<<<<<<< HEAD
	private final String groupes_name;
=======
	private String groupes_name;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
	
	public Concert(List<Calendar>  dates, String groupes_name,int capacity,int duration) {
		super(capacity,dates,duration);
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
