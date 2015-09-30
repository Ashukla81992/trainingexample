package clinic;

public class Technician {
	private String techName;
	
	public Technician(String techName) {
		// TODO Auto-generated constructor stub
		this.techName=techName;
		
	}
	
	public Tests  orderTest(Patient p,Physician ph){
		String test=ph.problemTests(p);
		Tests t=new Tests(test, p, this, ph,1500);
		return t;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}
}
