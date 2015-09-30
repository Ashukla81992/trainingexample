package sept30;

import java.io.IOException;

public class JoinExample {

	public JoinExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
			Thread t=new Thread(){

				@Override
				public void run() {
					System.out.println("Reading");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Finished reading");
				}};
				t.start();
				
				try {
					t.join();
					System.out.println("this is it");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("there is some problem here");
					e.printStackTrace();
				}
				System.out.println("main over");
	}

}
