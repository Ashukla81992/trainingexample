package com.training;

public class Application {
	public static void main(String [] arg){
		int custid=Integer.parseInt(arg[0]);
		long handPhone=Long.parseLong(arg[2]);
		
		Customer c1=new Customer(custid,arg[1],handPhone);
		
		System.out.println(c1.showmessage());
	}
}
