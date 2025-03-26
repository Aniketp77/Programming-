package day16;

public class removespecialchar {

	public static void main(String[] args) {
		
		String str="for@t*u#ne!c)lo^ud%$&";
		
		System.out.println("before removing numbers : "+str);
		
		String str1=str.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println("after removing number : "+str1 );
	}

}
