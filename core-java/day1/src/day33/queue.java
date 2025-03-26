package day33;

import java.util.*;

public class queue {

	public static void main(String[] args) {
		
		Queue pq=new PriorityQueue();
		
		pq.add(2);
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(9);
		pq.add(7);
		
		Iterator i1 = pq.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
