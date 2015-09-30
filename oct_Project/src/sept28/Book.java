package sept28;


public class Book  {
	private int bookNumber;
	private String bookName;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName, double price) throws Rangecheck
	{
		super();
		if(bookNumber<1000 || bookNumber>5000){
			throw new Rangecheck(bookNumber);
		}
		else
		{
			this.bookNumber=bookNumber;
		}
		this.bookName = bookName;
		this.price = price;

	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookNumber+ 7 * this.bookNumber;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this==obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass()!=obj.getClass())
			return false;
		
		Book bk3=(Book)obj;
		return this.bookNumber==bk3.bookNumber && this.bookName.equals(bk3.bookName);
		
		//return super.equals(obj);
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		if(bookNumber<1000 || bookNumber>5000)
		{
			try {
				throw new Rangecheck(bookNumber);
			} catch (Rangecheck e) {
				System.out.println(e.getMessage());
			}
		}
		else 
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
