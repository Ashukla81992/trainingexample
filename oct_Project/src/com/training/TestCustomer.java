package com.training;

public class TestCustomer {
	public static void main(String arg[]){
		Customer cust1=new Customer();
		
		cust1.setCustid(102);
		cust1.setName("Sachin");
		cust1.setHandPhone(8443257493l);
		
		
		System.out.println("Id+name+number: "+cust1.getCustid()+" + "+cust1.getName()+" + "+cust1.getHandPhone());
		
		Customer cust2=new Customer(103, "Dhoni", 2339873023l);
		System.out.println("Id+name+number: "+cust2.getCustid()+" + "+cust2.getName()+" + "+cust2.getHandPhone());
		System.out.println(cust2.showmessage());
	}
	

}
