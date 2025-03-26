package string;

public class reverse_string {
	
	
	public static String reverse(String str) {
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+= str.charAt(i);	
		}
		
		return reverse;
	}
	
	public static String [] reverseword(String str) {
		
		String arr[] =str.split(" ");
		String reverse[] =new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			reverse[i]=reverse(arr[i]);
		}
		return reverse;

	}

	public static void main(String[] args) {
		
//		System.out.println(reverse("hello word"));
		String arr[ ] = reverseword("my name is aniket");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
