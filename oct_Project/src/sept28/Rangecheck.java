package sept28;

public class Rangecheck extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5513658917890496082L;
	
	private int number;//=1500;

	public Rangecheck(int number) {
		super();
		this.number = number;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.number+" should be between 1000-1500";
	}
	

}
