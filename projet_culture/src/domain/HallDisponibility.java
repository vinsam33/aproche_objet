package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HallDisponibility {
	
<<<<<<< HEAD
	private  Map<Integer,Map<Integer,List<Hall>>> hallsDisponibility = new HashMap<>();

	
	public HallDisponibility(List<Hall> halls) {
=======
	private Map<Integer,Map<Integer,List<Hall>>> hallsDisponibility = new HashMap<>();
	private List<Hall> halls = new ArrayList<>();
	
	public HallDisponibility(List<Hall> halls) {
		this.halls = halls;
>>>>>>> 64d1ecf0aad97a0d8d93d265891e54933d0f1023
		for (int i = 1;i<=52;i++) {
			Map<Integer,List<Hall>> tmp = new HashMap<>();
			for (int j = 1; j <=7;j++) {
				tmp.put(j, new ArrayList<Hall>());
			}
			hallsDisponibility.put(i, tmp);
		}
		for (Hall h : halls) {
			for (Calendar date : h.getDate()) {
				hallsDisponibility.get(date.get(Calendar.WEEK_OF_YEAR)).get(date.get(Calendar.DAY_OF_WEEK)).add(h);
			}	
		}
	}

	public Map<Integer, Map<Integer, List<Hall>>> getHallsDisponibility() {
		return hallsDisponibility;
	}
	
	
}
