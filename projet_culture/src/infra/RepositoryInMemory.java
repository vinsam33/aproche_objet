package infra;

import java.util.HashMap;
import java.util.Map;

import domain.City;
import domain.Repository;

public class RepositoryInMemory implements Repository{
	private Map<Integer, City> repomemories;
	
	public RepositoryInMemory() {
		this.repomemories = new HashMap<Integer, City>();
	}
	
	@Override
	public void save(City city) {
		repomemories.put(city.getId(), city);
		
	}

	@Override
	public City findbyid(int id) {
		return repomemories.get(id);
		
	}

}
