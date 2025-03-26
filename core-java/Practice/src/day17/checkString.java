package day17;
//check wether string contain number or not 

//check whether the string contain only alphabets
import java.util.*;
public class checkString {

	public static void main(String[] args) {
		
		checkString ob =new checkString();
		ob.checkstring();
}
		void checkstring() {
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter the String");
			int flag=0;
			
			String str=s1.next();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("The number is not present in string");
			}
			else {
				System.out.println("The number is not present in string");
			}
			
		}
	}

