package day16;

class A{
	 void get() {
		System.out.println("goood morning");
	}
}
class B extends A{
	void get(){
		super.get();
		System.out.println("good night");
	}
}

public class superMethod {

	public static void main(String[] args) {
		B b1 =new B();
		b1.get();

	}

}
