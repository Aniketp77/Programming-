package day15;



class sample{
	static int a=10;
	static void show() {
//		System.out.println("aniket"+staticexample.b);
	}
}

class manager{
	static int mid;
	static String mname;
	static String memail;
	static String city="pune";

	
	manager(int mid,String mname, String memail){
		local.display();
		
		this.mid=mid;
		this.mname=mname;
		this.memail=memail;
		
		local.display();
		
	}
}
class local{
	static void display() {
		System.out.println("the manager id is : "+manager.mid);
		System.out.println("the manager name is : "+manager.mname );
		System.out.println("the manager memail is :"+manager.memail);
		System.out.println("the manager city is :"+manager.city);
		
		
	}
}

public class staticexample {
//	static int b=200;
	
	public static void main(String[] args) {

		manager m1 =new manager(1,"aniket","aniket@123");
		manager m2 =new manager(2,"vishal","vishal@123");
		
//		System.out.println(sample.a);
//		sample.show();

	}

}
