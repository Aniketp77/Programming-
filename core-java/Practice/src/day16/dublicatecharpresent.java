package day16;

public class dublicatecharpresent {

	public static void main(String[] args) {
		String s="aniket";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))//c==truee
				{
					count++;
					break;
				}
			}
		}
		System.out.println("count the duplicate char is :"+count);
		if(count==0) {
			System.out.println("not present");
		}
		else {
			System.out.println("present");
		}

	}

}
