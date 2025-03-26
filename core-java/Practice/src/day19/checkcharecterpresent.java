package day19;

public class checkcharecterpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hari";
		
		char ch='h';
		int flag=0;
		
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i)==ch) {
				flag=1;
			}
			i++;
		}
		if(flag==0) {
			System.out.println("not present");
		}
		else {
			System.out.println("present");
		}
		
	}

}
