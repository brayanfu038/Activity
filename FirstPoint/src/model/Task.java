package model;

import java.time.LocalDate;

public class Task {
	
	String description;
	LocalDate dueDate;
	
	public Task(String description, LocalDate date) {
		// TODO Auto-generated constructor stub
		this.description = description;
		dueDate = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
}
