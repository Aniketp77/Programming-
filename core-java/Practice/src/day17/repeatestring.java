package day17;
//repeat ezch character twice in the string

import java.util.Scanner;

//
public class repeatestring {

	public static void main(String[] args) {
		repeatestring ob =new repeatestring();
		ob.checkstring();
}
		void checkstring() {
			Scanner s1 = new Scanner(System.in);
			String name ="";
			System.out.println("enter the String");
			int flag=0;
			
			String str=s1.next();
			for(int i=0;i<str.length();i++) {
				name=name+str.substring(i,i+1)+str.substring(i,i+1);
				}
			System.out.println("string result : "+name);
			}

	}

