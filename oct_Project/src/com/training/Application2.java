package com.training;

import java.util.Scanner;
public class Application2 {
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer details");
		int custid=sc.nextInt();
		String name=sc.next();
		Long handPhone=sc.nextLong();
		
		Customer cust=new Customer(custid, name, handPhone);
		System.out.println(cust.showmessage());
		sc.close();
	}
}
