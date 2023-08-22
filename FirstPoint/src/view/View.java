package view;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
    }
   
	public void showGrapichMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public int readIntGrapichMessage(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	public String readStringGrapichMessage(String message) {
		return JOptionPane.showInputDialog(message);
	}
    public int readInt(String message) {
        System.out.println(message);
        return console.nextInt();
    }
    public String readString(String message) {
        System.out.println(message);
        return console.next();
    }
    public int menu(){
        String str= "1)----Ingresar Una Operacion En Notacion Polaca \n"
        		+"2)---Salir Del Programa";
        System.out.println(str);
       return console.nextInt();
    }
    public  void showMessageInt(int x){
        System.out.println(x);
    }
    public void showMessage(String str){
        System.out.println(str);
    }
    public long readLong(String message) {
    	System.out.println(message);
    	return console.nextLong();
    }
    
    public String firstMenu() {
    	String value="1)Crear Usuario\n"
    				+"2)Añadir Tarea\n"
    				+"3)Mostrar Tareas Por Cada Usuario\n"
    				+"4)Salir Del Programa";
    	return value;
    }
  
}

