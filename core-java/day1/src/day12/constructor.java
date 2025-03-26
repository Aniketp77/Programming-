package day12;

	class Manager{
		int mid;
		String mname;
		
		Manager(){
			System.out.println("welcome home");
		}
		
		Manager(int x,String y){
			
			 mid=x;
			 mname=y;
		}
	}
	

public class constructor {

	public static void main(String[] args) {
		
		new Manager();
		
		Manager m1=new Manager(101,"aniket");
		System.out.println(m1.mid);
		System.out.println(m1.mname);
				
	}

}
