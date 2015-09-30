package clinic;

import java.util.Scanner;


public class Patient {

	private String patientName;
	private String problem;
	private int age;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	
	public String getProblem() {
		return problem;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Patient(String patientName,int age){
		this.patientName=patientName;
		problem=problemName();
		this.age=age;
	}
	public Patient(){
		this.patientName="Guest";
		problem=problemName();
		this.age=18;
	}
	@SuppressWarnings("resource")
	public String problemName(){
		String problem=null;
		System.out.println("Choose your problem :");
		int i;
		System.out.println("Choose /n 1.For blood related problem /n 2.For bones related prob /n 3.For MRI related");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		switch(i){
		case 1: {
			problem= "bloodrelated";
			break;
		}
		case 2: {
			problem= "bonerelated";
			break;
		}
		case 3: {
			problem= "mrirelated";
			break;
		}
		}
		return problem;
	}
}
