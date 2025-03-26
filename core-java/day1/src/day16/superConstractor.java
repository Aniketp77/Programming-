package day16;

class ani{
	ani(){
		System.out.println("parent class ");
	}
	
}
class bike extends ani{
	bike(){
		System.out.println("child class");
	}
}

public class superConstractor {

	public static void main(String[] args) {
		new bike();
		

	}

}
