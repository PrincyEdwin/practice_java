package practice_java;
import java.lang.System;

	
public class demo {

	
	int marks;
	String name;
	
	
	demo()
	{
		System.out.println("Empty Constructor");
		}
	
	// Parameterized Constructor
	
	// To initialize an object you can use constructor.
	
	demo(int a, String b)
	{
		marks = a;
		name = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo ob1 = new demo(55, "Mary");
		demo ob2 = new demo( 78, "Henry");
		demo obj3 = new demo();
		
		// when creating object for the class I can pass parameters 
		
		System.out.println(ob2.marks);
		
		
		
	}

}
