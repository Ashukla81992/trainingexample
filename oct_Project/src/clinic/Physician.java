/**
 * 
 */
package clinic;

import java.util.Scanner;

/**
 * @author ashu15
 *
 */
public class Physician {

	/**
	 * 
	 */
	private String phyName;
	private String expertise;
	
	public Physician(String phyName,String expertise) {
		// TODO Auto-generated constructor stub
		this.expertise=expertise;
		this.phyName=phyName;
	}

	public String getPhyName() {
		return phyName;
	}

	public void setPhyName(String phyName) {
		this.phyName = phyName;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	public String problemTests(Patient p){
		String prob=null;
		prob=p.getProblem();
		return prob;
	}
	public String[] returnstatus(Patient p,Tests t){
		String[] status=new String[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Physician please enter patients blood status: ");
		status[0]=sc.nextLine();

		System.out.println("Physician please enter patients blood group: ");
		status[1]=sc.nextLine();
		return status;
		
	}
}
