package Multilevel;

public class Dog  extends Animal{
	
	void eat() {
		System.out.println("this is child method");
	}
 void bark() {
	 System.out.println("barking");
 }
	public static void main(String[] args) {
		Dog obj =new Dog();
		obj.eat();
		obj.bark();
		System.out.println("*********");
		Animal obj1 =new Animal();
		obj.pro();
		obj.eat();
		//obj.pro();
		System.out.println("&&&&&&&&&&");
		Animal obj2=new Dog();
		obj.pro();
		obj.eat();
		System.out.println("%%%%%%%%%%%%%%");
		//not allowed
		//Dog obj=new Animal();
		
		
		
	}

}
