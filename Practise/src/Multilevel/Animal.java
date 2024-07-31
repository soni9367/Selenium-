package Multilevel;

public class Animal {
	
	
	void eat () {
		System.out.println("parent eat method");
	}
	
	void pro() {
		System.out.println("protect");
	}

	public static void main(String[] args) {
		Animal obj =new Animal();
		obj.eat();
		obj.pro();

	}

}
