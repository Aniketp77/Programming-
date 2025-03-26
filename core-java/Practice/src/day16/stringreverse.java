package day16;

public class stringreverse {

	public static void main(String[] args) {
		
		String str="aniket";
		String rev="";
		
		System.out.println("before reverse : "+str);
		
		for(int i=str.length()-1;i>=1;i--) {
			rev=rev+str.charAt(i);	
		}
		System.out.println("after reverse : "+rev);

	}

}
