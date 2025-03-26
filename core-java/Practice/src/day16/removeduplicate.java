package day16;

public class removeduplicate {

	public static void main(String[] args) {
		String str="fortunecloud";
		
		String new_str="";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				new_str=new_str+str.charAt(i);
				
			}
		}
		System.out.println("after removed string charecters :"+new_str);

	}

}
