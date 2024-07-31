package Multilevel;

public class Babydog extends Dog{
	
	void eat() {
		System.out.println("this is my baby child method");
	}
	
	void weep() {
		System.out.println("weeping");
	}

	public static void main(String[] args) {
		Babydog obj=new Babydog();
		obj.eat();
		obj.weep();
		System.out.println(">>>>>>>>>>>>>>");
		
      Dog obj1 =new Dog();
      obj.eat();
      obj.bark();
      
      System.out.println("*******");
      
       Animal obj2 = new Animal();
       obj.eat();
       obj.pro();
       obj.weep();
       
       System.out.println("%%%%%%%%%%%%%");
       Dog obj3=new Babydog();
       obj.eat();
       
       System.out.println("$$$$$$$$");
       
       Animal obj4 =new Babydog();
       obj.eat();
       obj.bark();
       obj.pro();
       
      
      
      
	}

}
