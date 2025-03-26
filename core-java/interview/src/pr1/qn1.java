package pr1;

import java.util.*;

public class qn1 {

	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		m1.put("id", "1");
		m1.put("name", "orange");
		m1.put("price", "100");
		m1.put("quality", "1");
		
		System.out.println(m1);
		
//		Iterator i1 = new iterator();
		
		
		ArrayList l1 = new ArrayList();
		l1.add("id : 1");
		l1.add("name : orange");
		l1.add("price : 100");
		l1.add("quality : 1");
//		l1.add("orange","name");
//		l1.add(,"ksjfdk");
//		l1.add(10,"ksjfdk");
		

		Iterator i1 = l1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}
	

}
