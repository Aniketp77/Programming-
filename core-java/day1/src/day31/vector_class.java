package day31;
import java.util.*;

public class vector_class {

	public static void main(String[] args) {
		Vector v1 =new Vector();
		v1.add("aniket");
		v1.add("19");
		v1.add("1.9");
		v1.add("c");
		v1.add("1.9");
		v1.add(null);
		
		Enumeration e1= v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}

	}

}
