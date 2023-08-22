package presenter;

import model.MedicalCenter;
import view.View;

public class Presenter {
	
	MedicalCenter center;
	View view;
	public Presenter() {
		center = new MedicalCenter();
		view = new View();
	}
	
	public void run() {
		int option;
		do {
			switch (option = view.readIntGrapichMessage(view.firstMenu())) {
			case 1:
				center.addPatient(view.readStringGrapichMessage("Ingrese el nombre del paciente"),view.readIntGrapichMessage("Ingrese el nivle de gravedad :"));
				break;
			case 2:
		
				view.showGrapichMessage(center.showPriority());
				break;
				
			default:
				break;
			}
		} while (option !=3);
	}
	public static void main(String[] args) {
		Presenter presenter = new Presenter();
		presenter.run();
	}
	
}
