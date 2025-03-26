package day32;

import java.util.*;

public class class_task1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(21);
		a1.add(11);
		a1.add(48);
		a1.add(94);
		a1.add(54);
		a1.add(76);
		a1.add(54);
		
		
		
		Iterator i1= a1.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
			
		}
	}

}
