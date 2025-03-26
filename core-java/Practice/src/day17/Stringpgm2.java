package day17;
//check whether is string matches lexicographically.
public class Stringpgm2 {

	public static void main(String[] args) {
		String s1="bat";
		String s2="TRIP";
		
		System.out.println();
		
		int number =s1.compareTo(s2);
		
		if(number<0) {
			System.out.println("first string is smallest");
			
		}
		else if(number >0) {
			System.out.println("secount string is largest");
		}
		else {
			System.out.println("both string are equals");
		}

	}

}
