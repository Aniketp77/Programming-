package day9;


class cal{
	int a=3,b=7,c;
	
	void addition() {
		System.out.println("additon is :"+(a+b));
		
	}
	
	void substraction() {
		System.out.println("substraction is :" + (a-b));
		
	}
	
	void division() {
		System.out.println("division is : " + (a/b));
		
	}
	
	void multipliction() {
		System.out.println("multipliction is :"+(a*b));
		
	}
}
public class classObject {

	public static void main(String[] args) {
		
	cal c1=new cal();
	
	c1.addition();
	c1.substraction();
	c1.multipliction();
	c1.division();
	}

}
