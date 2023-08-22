package model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedicalCenter {
	
	PriorityQueue<Patient>patients;
	Comparator<Patient>comparator; 

	public MedicalCenter() {
		comparator = new Comparator<Patient>(){

			@Override
			public int compare(Patient object1, Patient object2) {
				if(object1.getPriority() != object2.getPriority()) {
				
					return Integer.compare(object2.getPriority(),object1.getPriority());
				}
				return Integer.compare(object2.getPriority(),object1.getPriority());
			}
           
        };
		patients = new PriorityQueue<Patient>(comparator);
	}
	
	public void addPatient(String name , int priority) {
		patients.add(new Patient(name,priority));
	}
	
	public String showPriority() {
		String print = "--------turno--------- \n";
		int i = 1;
		while (!patients.isEmpty()) {
			Patient patient = patients.poll();
			print +=i+")"+ patient.getName()+" Priority: " + patient.getPriority()+ "\n";
			i++;
		}
			return print;
	}
}
