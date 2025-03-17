package practice_java;

interface playable{
	
	// methods created inside interface are abstract methods.
	
	// abstract methods dont have a body. 
	
	// after java 8 you can create body for the method by using a default keyword or static keyword.
	
	// we cant create object for interface
	
	//so we can implement them in a class and access them.
	
	void play();
	
}

class Guitar implements playable
{

	@Override
	public void play() {
		System.out.println("Plays Guitar");
		
	}
	
}

class Piano implements playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Plays Piano");
	}
	
}

public class cha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guitar g = new Guitar();
		g.play();
		Piano p = new Piano();
		p.play();
	}

}
