package Abstract_nonabstract;

public class Honda extends Bike {
	
	void run() {
		System.out.println("honda running");
	}

	public static void main(String[] args) {
		Bike obj =new Honda();
		obj.changeGear();
		obj.run();
		Honda obj1 =new Honda();
        //Bike obj2=new Bike();
        //Honda obj3=new Bike();

	
		
	}

}
