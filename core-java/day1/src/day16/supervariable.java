package day16;

class parent{
	String name="aniket";
	
}
class child extends parent{
	
	String name="paradeshi";
	void display() {
		System.out.println(super.name);
	}
}

public class supervariable {

	public static void main(String[] args) {
		child b1 = new child();
		b1.display();

	}

}
