package domain;

public interface Repository {
	public void save(City city);
	public City findbyid(int id);

}
