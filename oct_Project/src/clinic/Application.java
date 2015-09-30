package clinic;

import java.util.Scanner;

public class Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patientsName and age");
		
		Patient p=new Patient(sc.next(), sc.nextInt());
		Physician phy=new Physician("lallu", "Blood");
		Technician tech=new Technician("Mulayam");
		Tests t=tech.orderTest(p, phy);
		t.genratereport();
		
	}

}
