package practice_java;

class A extends Thread{
	
	// If you want to create a thread your class should extend Thread
	// Also write a run method which will be started in main class.
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
		
		System.out.println("Hey Hello..");
		try {
			sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		}
}

class B extends Thread{
	// whenever you want both the threads to work simultaneously we need to use the sleep
	// sleep should always be inside try catch to handle exception.
	
	public void run() {
		for ( int i=0;i<10;i++) {
			
		
		System.out.println("Okay Byee..");
		try {
			sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
	}

}
