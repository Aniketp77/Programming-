package day27;

class train{
	
	
	public static int seat=50;
	
	public  synchronized void check(int seat1) {
		
		
		 if(seat1<=seat) {
			 seat=seat-seat1;
			 System.out.println("Booked Remaining Seat" + seat);
		 }
		 else
		 {
		
			 System.out.println("Remaining Seat are" + seat); 
		 }
		
		
	}
	
}

class person1 extends Thread{
	train t1=new train();
	
	public void run() {
		t1.check(20);
	}
	
}

class person2 extends Thread{
	train t1=new train();
	
	
	public void run() {
		t1.check(20);
	}
	
}
class person3 extends Thread{
	train t1 =new train();
	
	public void run() {
		t1.check(10);	
		
	}
}
public class trainbookingapp {

	public static void main(String[] args) {
		
//		train t1 = new train();
		
		
		person1 p1 = new person1();
		p1.start();
		person2 p2 = new person2();
		p2.start();
		person3 p3 = new person3();
		p3.start();
		
		

	}

}
