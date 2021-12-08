package domain;

import java.util.UUID;

public interface Repository {
	public void save(City city);

	public City findbyid(UUID id);

}
