package day11;

class student{
	student(){
		this(9);
		System.out.println("first");
	}
	student(int x){
//		this(); // how
		System.out.println(x);
	}
	
	student(int x, int y){
		this();
		System.out.println(x+y);
	}
	
}

public class constractor_this {

	public static void main(String[] args) {
		
		new student(4,50);
	}

}
