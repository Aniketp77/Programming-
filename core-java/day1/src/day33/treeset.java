package day33;

import java.util.*;

public class treeset {

	public static void main(String[] args) {
		
		TreeSet t1 = new TreeSet();
		t1.add(23);
		t1.add(43);
		t1.add(56);
		t1.add(1);
		t1.add(10);
		t1.add(67);
		t1.add(67);
		
		Iterator i1 = t1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}
