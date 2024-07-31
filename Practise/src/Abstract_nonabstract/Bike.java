package Abstract_nonabstract;

public abstract class Bike {
	
	Bike(){
		System.out.println("bike created");
	}
	
	abstract  void run() ;
	
	
	void changeGear() {
		System.out.println("gear changed");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
