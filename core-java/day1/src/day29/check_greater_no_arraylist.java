package day29;
import java.util.*;


public class check_greater_no_arraylist{

	public static void main(String[] args) {
		
//		Scanner s1 =new Scanner(System.in);
		//just add homogenus data
		ArrayList a1=new ArrayList();
		
		a1.add(23);
		a1.add(33);
		a1.add(43);
		a1.add(53);
		a1.add(463);
		a1.add(73);
		
		System.out.println("fetching the element from the particular position of the list : "+a1.get(0));
		System.out.println("return the index in this list of the first occurrence of the specified element : "+a1.indexOf(33));
		System.out.println("used to remove the element present at the specified position in the list. : "+a1.remove(1));
		System.out.println("used to return the number of elements present in the list. : "+a1.size());
		System.out.println("used to replace the specified element in the list, present at the specified position. : "+a1.set(0, 44));
		
		int max=0;
		for(int i=0;i<a1.size();i++) {
			
			if((int) a1.get(i)>max) {
				max=(int )a1.get(i);
				
			}
		}
		System.out.println("greater number from the array list is :"+max);


	}

}
