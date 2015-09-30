package pro24;

public class DivByZero {
 public static void main(String args[]) {
 try {
	System.out.println(3/0);
	System.out.println("Please print me");
	} catch (ArithmeticException exc) {
 		//Division by zero is an ArithmeticException
			System.out.println(exc);
		}
 		System.out.println("kghskdfg");
		System.out.println("After exception");
 	}
 }
