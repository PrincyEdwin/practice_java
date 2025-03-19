package practice_java;
import java.util.Scanner;


class divexample{
	
	
	void divnum(int num, int den) 
	{
	
	
	try {
		
		int result = num / den;
		System.out.println("Result is "+ result);
	}
	catch(Exception e)
	{
		System.out.println("Cannot divide by zero");
	}
}

}
public class codechal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc. nextInt();
		int b = sc.nextInt();
		divexample d = new divexample();
		d.divnum( a, b);
	}

}
