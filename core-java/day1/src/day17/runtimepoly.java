package day17;

//to change the defination of parent class.

class A{
	void home() {
		System.out.println("parent class");
	}
}
class B extends A{
	void home() {
		super.home();
		System.out.println("child class");
	}
}
public class runtimepoly {

	public static void main(String[] args) {
		B b1=new B();
		b1.home();

	}

}
