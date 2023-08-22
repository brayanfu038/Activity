package presenter;

import java.time.LocalDate;

import model.ShoppingCart;
import view.View;

public class Presenter {
	ShoppingCart cart;
	View view;
	public Presenter() {
		// TODO Auto-generated constructor stub
		cart = new ShoppingCart();
		view = new View();
	}
	
	public void Run() {
		
		int option;
		do {
			switch (option = view.readIntGrapichMessage(view.firstMenu())) {
			case 1:
				cart.addItem(view.readStringGrapichMessage("Ingrese el nombre del Item: ")
						,view.readDoubleGrapichMessage("Ingrese el precio del Item: "));
				break;
			case 2:
				
				view.showGrapichMessage(cart.showItems());
				break;
			case 3: 
				view.showGrapichMessage(""+cart.calculatePrice());
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
