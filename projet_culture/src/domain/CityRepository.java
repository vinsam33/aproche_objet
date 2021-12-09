package domain;

import java.util.UUID;

public interface CityRepository {
	public void save(City city);

	public City findbyid(UUID id);

}
