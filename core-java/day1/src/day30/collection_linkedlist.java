package day30;

import java.util.*;

public class collection_linkedlist {

	public static void main(String[] args) {
		LinkedList l1 =new LinkedList();
		l1.add(86);
		l1.add("aniket");
		l1.add('a');
		l1.add(8.5);
		l1.add(86);
		
		System.out.println(l1);
		Iterator i1 = l1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
