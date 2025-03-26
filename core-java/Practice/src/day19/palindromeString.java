package day19;

public class palindromeString {

	public static void main(String[] args) {
		String str="nayan";
		
		String revstr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revstr= revstr+str.charAt(i);
		}
		System.out.println("reverse :"+revstr);
		if(str.equals(revstr)) {
			System.out.println("is palindrome ");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
