package practice;


class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child class constructor called");
    }
}


public class constractor_inharitance {

	public static void main(String[] args) {
        Child obj = new Child(); 
        // Output:
        // Parent class constructor called
        // Child class constructor called


	}

}
