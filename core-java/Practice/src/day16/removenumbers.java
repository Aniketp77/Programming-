package day16;

public class removenumbers {

	public static void main(String[] args) {
		String str="cr1a2vit3a";
		
		System.out.println("before removing numbers : "+str);
		
		String str1=str.replaceAll("[0-9]", "");
		
		System.out.println("after removing number : "+str1 );

	}

}
