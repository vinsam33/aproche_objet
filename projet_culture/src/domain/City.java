package domain;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class City {
	private HallDisponibility hallDisponibility;
<<<<<<< HEAD
	private List<Hall> halls = new ArrayList<>();
	//private List<Boolean> weeksTaken = new ArrayList<>();
=======
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
	
	public boolean attributeEvent(Event event) {
		Map<Integer,Map<Integer,List<Hall>>> halls =  hallDisponibility.getHallsDisponibility(); 
		for (Calendar date : event.getDates()) {
<<<<<<< HEAD
			List<Hall> possibleHalls = halls.get(date.get(Calendar.WEEK_OF_YEAR)).get(date.get(Calendar.DAY_OF_WEEK));
			for (Hall h : possibleHalls) {
				if((h.getCapacity()<= event.getCapacity()) && (event.getDuration() <= h.getDuration(date))){
					h.addEvent(event);
					//weeksTaken.set(date.get(Calendar.WEEK_OF_YEAR), true);
					possibleHalls.remove(h);
					return true;
				}
			}
=======
			
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
		}
		return false;
		
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
