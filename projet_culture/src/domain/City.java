package domain;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class City {
	private HallDisponibility hallDisponibility;
	
	public boolean attributeEvent(Event event) {
		Map<Integer,Map<Integer,List<Hall>>> halls =  hallDisponibility.getHallsDisponibility(); 
		for (Calendar date : event.getDates()) {
			
		}
		return false;
		
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
