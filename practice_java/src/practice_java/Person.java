package practice_java;

 class Person1 {

	String name;
	
	Person1 (String name)
	{
		
		System.out.println(name);
		
	}
}
 
 class Employee extends Person1{
	 
	 int empId;
	 
	 Employee (String name)
	 {
		 super("John");
	 }
	 
 }

public class Person {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Person1 p = new Person1 ("Jerusha");
			
		
	}

}
