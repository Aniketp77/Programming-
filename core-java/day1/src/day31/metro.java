package day31;

import java.lang.reflect.Array;
import java.util.*;

class stackImpli {

	Object ol[] = new Object[100];

	int l = ol.length;
	int n;
	Scanner s1 = new Scanner(System.in);

//	public stackImpli() {
//		// TODO Auto-generated constructor stub
//
//		System.out.println("Enter the size of");
//		n = s1.nextInt();
//	}

	public void push() {
		System.out.println("Enter data either single or comma seperated!");
		String readValue = s1.nextLine();
		String[] strArray = readValue.split(",");
		int latestIndex = 0;
		for (int i = 0; i < l; i++) {
			if (ol[i] == null) {
				latestIndex = i;
				break;
			}
		}
//		System.out.println(latestIndex);
//		System.out.println(strArray.length);
		for (int j = 0; j < strArray.length; j++) {
			ol[latestIndex] = strArray[j];
			latestIndex++;
		}

	}

	public Object pop() {

		for (int i = 0; i < l; i++) {
			if (ol[i] == null) {
				String removedElement = (String) ol[i - 1];
				ol[i - 1] = null;
				System.out.println("Item removed :" + removedElement);
				break;
			}
		}
		return 0;
	}

	public Object peek() {
		for (int i = 0; i < l; i++) {
			if (ol[i] == null) {
				String peekElement = (String) ol[i-1];
//				ol[i] = null;
				System.out.println("peek element :" + peekElement);
				break;
			}
		}
		return 0;
	}

	public Object display() {
		System.out.println("Pushed Element in stack :");
		for (int i = 0; i < l; i++) {
			if (ol[i] != null) {
				System.out.println(ol[i]);
			}
		}
		return 0;
	}
}

public class metro {

	public static void main(String[] args) {
		stackImpli s2 = new stackImpli();
		int n, choice;

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");

			System.out.println("\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				s2.push();
				break;

			case 2:
				s2.pop();
				break;
			case 3:
				s2.peek();
				break;
			case 4:
				s2.display();
				
			case 5:
				
		default:
				System.out.println("invalid input");

			}

//		System.out.println("do u want contiunue the press yes or no");
//		String yes="yes";
//		String y =sc.nextLine();

		} while (choice == 5);

	}

}
