package practice_java;

abstract class Animal{
	String name;
	
	Animal(String name)
	{
		
		this.name = name;
	}

	abstract void makeSound();
	
}

class Dog extends Animal{
	
	
	Dog(String name)
	{
		// whenever the dog class object is created, dog constructor is created and it will be invoked.
		
		super(name);
		
		// 
	}
	
	
	
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bow bow");
	}
}

class Cat extends Animal{
	
	Cat(String name)
	{
		super(name);
	}
	
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow");
	}
}






public class cha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// we are passing the name from child dog to parent animal
		Dog d = new Dog("Bobby");
		d.makeSound();
		System.out.println(d.name);
		Cat c = new Cat("Jimmy");
		c.makeSound();
		System.out.println(c.name);
	}

}
