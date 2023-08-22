package model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.ListIterator;

public class TaskManagement {
	
	LinkedList<User>users;
	
	public TaskManagement() {
		
		users = new LinkedList<User>();
	
	}
	// metodo para crear usuario
	public void createUser(String name, int id) {
		
		User user = new User(name,id);
		
		users.add(user);
	}
	
	//metodo para crear una task
	public Task createTask(String description,LocalDate date) {
		
		Task task = new Task(description,date);
		
		return task;
	}
	// metodo para añadir nua task a un usuario segun su id
	public void addTask(int id , Task task) {
		
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId() == id) {
				users.get(i).getTasks().add(task);
		}
	  }
	}
		
	public String showUserTasks() {
		
		String showTask = "";
		ListIterator<Task> iterator;
		for (int i = 0; i < users.size(); i++) {
			
			showTask += "User: " + users.get(i).getName()+"\n--------Tasks--------\n";
			iterator = users.get(i).getTasks().listIterator();
			
					while (iterator.hasNext()) {
						Task task = (Task) iterator.next();
						showTask+= "Description: "+task.getDescription() +"\nFechaVencimiento: "+ task.getDueDate()+"\n \n";
			}
					
		}
		return "El precio total es: "+showTask;
	}	 
}
