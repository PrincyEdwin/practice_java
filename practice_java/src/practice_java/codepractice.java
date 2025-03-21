package practice_java;



class C implements Runnable{
	
	// Runnable is an interface that is implemented by Thread so instead of extending thread
	// we are implementing runnable

	public void run() {
		
		System.out.println("Hello  have a Good Day!");
	}
}
public class codepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			C a1 = new C();
			
			
			// we dont have start function in runnable, start function is inside thread.
			// so we create a class for thread.
			
			Thread t1 = new Thread(a1);
			t1.start();
			
			
	}

}
