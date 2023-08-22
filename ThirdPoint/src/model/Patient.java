package model;

public class Patient {
	
	String name;
	int priority;
	
	public Patient(String name,Integer priority) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}
