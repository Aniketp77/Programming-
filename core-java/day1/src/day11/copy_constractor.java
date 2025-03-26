package day11;

class copy{
	
	int sid;
	String name;
	copy(int x,String y){
		sid=x;
		name=y;
		
	}
	
	void display() {
		System.out.println("id is :"+sid);
		System.out.println("id is :"+name);
	}
	copy(copy mk){
		sid=mk.sid;
		name=mk.name;
	}
	
}
public class copy_constractor {

	public static void main(String[] args) {
		copy c1 = new copy(20,"aniket");
		c1.display();
		
		copy c2 = new copy(c1);
		c2.display();
		
		copy c3 = new copy(c2);
		c3.display();
		
		copy c4 = new copy(c3);
		c4.display();
		copy c5 =new copy(c4);
		c5.display();

	}

}
