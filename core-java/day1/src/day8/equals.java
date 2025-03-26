package day8;

public class equals {
	public static void main(String args[]) {
//		
//		String s1=new String("hello");
////		String s2="hello";
//		
//		  String s2=s1.concat("hello");
//		
//		System.out.println(s1.equals(s2)); //comparing two refrances.

		
		
//		StringBuffer s1= new  StringBuffer("hello");
//		StringBuffer s2= s1.append(s1);
//		
//		System.out.println(s1==s2); //comparing two refrances.
//		
//		System.out.println(s1.toString().equals(s2.toString()));
		
		
		//.equals()
		
		String s1="hello";
    	String s2="hello";
		//String s2=s1.concat("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		if(s1==s2) {
			System.out.println("true");
		}
		else 
			System.out.println("false");
	
	}
}

//		  s1=s1.concat(" india");