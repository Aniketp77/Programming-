package day19;

 class parent {
	
	static int a=10;
	int c=20;
	void get() {
		System.out.println("parent class");
	}
	void data() {
		System.out.println("parent data is: "+a);
	}
}
class child{
	int b=20;
	parent p1 = new parent();
	void display() {
		System.out.println("child class");
	}
	void data() {
		
//		super.get();
		System.out.println("child data : "+(parent.a+b));
		
	}
}

public class has_a_ralationship {

	public static void main(String[] args) {
		child c1=new child();
		c1.display();
		c1.data();
		c1.p1.get();
		c1.p1.data();

	}

}
