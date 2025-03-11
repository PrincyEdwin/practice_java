package practice_java;


class Counter{
	
	static int count = 0;
	int instancenum = 0;
	


	Counter()
	{
		count = count + 1;
		instancenum = instancenum + 1;
		
		
	}
	
	void display()
	{
		
		System.out.println("Static count =" +count);
		System.out.println("instancenum =" +instancenum);
		
		
	}
}
public class challenge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Counter c1 = new Counter();
			c1.display();
			Counter c2 = new Counter();
			c2.display();
			Counter c3 = new Counter();
			c3.display();
			
			// static variable is shared among all objects in a class so static variable is getting updated
			// each time an object is created.
			
			// where as int instancenum is not static variable. so each time an object is created it is initialized as 0.
	}

}
