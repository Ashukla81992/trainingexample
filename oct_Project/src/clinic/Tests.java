package clinic;

public class Tests {
	private String testName;
	private String status;
	private Patient pat;
	private Technician tech;
	private Physician ph;
	private int fee;
	
	

	public Tests(String testName, Patient pat, Technician tech,
			Physician ph,int fee) {
		super();
		this.testName = testName;
		this.pat = pat;
		this.tech = tech;
		this.ph = ph;
		this.fee=fee;
	}
	
	public void genratereport(){
		String report[]=ph.returnstatus(this.pat, this);
		System.out.println("Patient's name: "+pat.getPatientName());
		System.out.println("Patient's age: "+pat.getAge());
		System.out.println("Patient's prob: "+pat.getProblem());
		System.out.println("Physician's name: "+ph.getPhyName());
		System.out.println("Technician's name: " + tech.getTechName());
		
		System.out.println("Patient's status: "+ report[0]);
		System.out.println("Patient's blood group: "+ report[1]);
		System.out.println("Fee: "+this.fee);
	}
	

}
