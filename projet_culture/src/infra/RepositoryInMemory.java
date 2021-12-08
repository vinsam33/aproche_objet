package infra;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import domain.City;
import domain.Repository;

public class RepositoryInMemory implements Repository {
	private Map<UUID, City> repomemories;

	public RepositoryInMemory() {
		this.repomemories = new HashMap<UUID, City>();
	}

	public void save(City city) {
		repomemories.put(city.getId(), city);

	}

	public City findbyid(UUID id) {
		return repomemories.get(id);

	}

}
