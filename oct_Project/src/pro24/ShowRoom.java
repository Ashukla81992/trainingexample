package pro24;

public class ShowRoom {
	public Automobile getproduct(int key)
	{
		@SuppressWarnings("unused")
		Automobile auto =null;
		switch(key)
			{
		case 1:
			return new MarutiCar();
			case 2:
				return new Toyota();
			default: return null;	
			
			}
			}
		
	


}
