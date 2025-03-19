package practice_java;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String a){
	
	super(a);
}
}
class AgeValidator{
	
	void checkAge(int age) {
		
		try {
			if(age < 1 || age > 150) {
				throw new InvalidAgeException("Age is Invalid");
			}
			else {
				System.out.println("Age is Valid");
			}
		}
			catch(Exception e) {
				
				System.out.println(e);
			}
		}
	}

public class codecha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		AgeValidator a = new AgeValidator();
		a.checkAge(age);
		
	}

}
