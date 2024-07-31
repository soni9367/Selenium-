package Abstract;

public class TestBank {

	public static void main(String args[]){
		
		Bank b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getrateofinterrest()+" %");    
		 b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getrateofinterrest()+" %"); 
		

	}}    

