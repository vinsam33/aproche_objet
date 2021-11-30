package domain;

public abstract class Event {
	private int capacity;
	
	public Event(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

}
