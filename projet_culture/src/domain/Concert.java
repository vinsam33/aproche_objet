package domain;

import java.util.Date;

public class Concert extends Event{
	
	
	private Date date;
	private String groupes_name;
	
	public Concert(Date date, String groupes_name,int capacity) {
		super(capacity);
		
		this.date = date;
		this.groupes_name = groupes_name;
	}

	public Date getDate() {
		return date;
	}

	public String getGroupes_name() {
		return groupes_name;
	}


}
