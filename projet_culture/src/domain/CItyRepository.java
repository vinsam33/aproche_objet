package domain;

import java.util.UUID;

public interface CItyRepository {
	public void save(City city);

	public City findbyid(UUID id);

}
