package Abstract;

public class Honda extends Bike {
	 
		void run(){
			System.out.println("running safely");}  
		public static void main(String args[]){  
		 Bike obj = new Honda();  
		 obj.run();  
		 
		 //Honda obj1 = new Bike(); it can not create object
		// obj.run();
		 
		 Honda obj2 =new Honda();
		 obj.run();
		 
		// Bike obj3 =new Bike(); it cannot create object
		 //obj.run();
		}

		}
		
		
	//}

