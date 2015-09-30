package sept28;

/**
 * @author ashu15
 *
 */
public class Application {
	
/**
 * 
 * @param args
 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Book bk = new Book(1081, "Asfg", 236.55);
			
			Book bk1=new Book(1001, "Asfg", 236.55);
			
			System.out.println("are same?:"+ bk1.equals(bk));
			
		} catch (Rangecheck e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("dfhsdh");
	}

}
