package day4;
import java.util.*;
public class userlogin {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		String user; //declaration
		
		String ap="yes"; 
		 System.out.println("are you a registerd user");
			 user=s1.nextLine();
		
		if(user.equals(ap)) {
		String a1= new String("adminfct");
		String a2 =new String("admin");
		
		
		System.out.println("enter the user name");
		String a=s1.nextLine();
		
		System.out.println("enter the user passward");
		String b=s1.nextLine();
		
		
		if(a.equals(a1) && b.equals(a2)) {
			System.out.println("login successful");
		}
		else{
			System.out.println("unsuccessful");
		}
		}
		else {
			System.out.println("get out");
		}
	
	}

}
