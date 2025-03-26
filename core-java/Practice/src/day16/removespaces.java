package day16;

public class removespaces {

	public static void main(String[] args) {
		
		String s="a n i k e t";
		System.out.println("before removing spaces string : "+s);

		String ns=s.replaceAll(" ", "");
		
		System.out.println("after removing spaces string : "+ns);
	}

}
