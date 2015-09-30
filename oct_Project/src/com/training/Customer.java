package com.training;

public class Customer {
	private int custid;
	private String name;
	private long handPhone;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custid, String name, long handPhone) {
		super();
		// TODO Auto-generated constructor stub
		this.custid=custid;
		this.name=name;
		this.handPhone=handPhone;
	}	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
	public String showmessage(){
		return "Dear "+name+" we will contact you on "+handPhone;
	}
}
