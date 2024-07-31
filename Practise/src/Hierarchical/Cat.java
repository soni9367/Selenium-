package Hierarchical;

public class Cat extends Animal {
	
	
   public void mew() {
	    System.out.println("mewoooo");
   }
	public static void main(String[] args) {
	 Cat v = new Cat();
	 v.eat();
	 //v.bark();
	 v.mew();

	}

}
