package presenter;

import java.time.LocalDate;

import model.TaskManagement;
import view.View;

public class Presenter {
	TaskManagement system;
	View view;
	public Presenter() {
		// TODO Auto-generated constructor stub
		system = new TaskManagement();
		view = new View();
	}
	
	public void Run() {
		
		int option;
		do {
			switch (option = view.readIntGrapichMessage(view.firstMenu())) {
			case 1:
				system.createUser(view.readStringGrapichMessage("Ingrese el nombre"),view.readIntGrapichMessage("Ingrese el id"));
				break;
			case 2:
				system.addTask(view.readIntGrapichMessage("Ingrese El Id Del Usuario: "), system.createTask(view.readStringGrapichMessage("Ingrese La Descripcion: "),
				LocalDate.of(view.readIntGrapichMessage("Año: "),view.readIntGrapichMessage("Mes: "),view.readIntGrapichMessage("dia"))));
				break;
			case 3: 
				view.showGrapichMessage(system.showUserTasks());
				break;
				
			default:
				break;
			}
		} while (option !=4);
		
		
	}
	public static void main(String[] args) {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
}
