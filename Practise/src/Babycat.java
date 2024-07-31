
public class Babycat extends Cat {
	
	void weep() {
		System.out.println("weeping");
	}

	public static void main(String[] args) {
		Babycat v=new Babycat();
		v.eat();
		v.meow();
		v.weep();

	}

}
