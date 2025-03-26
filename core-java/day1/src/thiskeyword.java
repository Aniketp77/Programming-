package day14;	
class Student{
		int sid;
		String sname;
		
		
		void display() {
			
			this.show(10, "aniket");
			
			System.out.println("ID is :" + sid);
			System.out.println("Sname is :" + sname);
		}
		
		
		void show(int sid, String sname) {
			this.sid=sid;
			this.sname=sname;
			
			
		}
	}


public class thiskeyword {


	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();
		

	}

}
