package day31;

import java.util.*;

class StackImpl {
    Object ol[] = new Object[100];
    int l = 0; // Track the current size of the stack
    Scanner s1 = new Scanner(System.in);

    public void push() {
        int n;
        System.out.println("Enter the number of elements to push:");
        n = s1.nextInt();
        System.out.println("Enter data:");
        for (int i = 0; i < n; i++) {
            if (l < ol.length) {
                ol[l++] = s1.next();
            } else {
                System.out.println("Stack overflow");
                break;
            }
        }
    }

    public Object pop() {
        if (l == 0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            Object poppedElement = ol[--l];
            ol[l] = null; // Clear the popped element
            System.out.println("Popped Element: " + poppedElement);
            return poppedElement;
        }
    }

    public Object peek() {
        if (l == 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println("Top Element: " + ol[l - 1]);
            return ol[l - 1];
        }
    }

    public void display() {
        System.out.println("Elements in stack:");
        for (int i = 0; i < l; i++) {
            System.out.println(ol[i]);
        }
    }
}
public class online_practice {

	public static void main(String[] args) {
		  StackImpl s2 = new StackImpl();
	        int choice;

	        do {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter your choice:");
	            System.out.println("\n1. PUSH\n2. POP\n3. PEEK\n4. DISPLAY\n5. EXIT");
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
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	}

}
