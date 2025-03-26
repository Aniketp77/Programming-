package day34;

import java.util.*;

public class linkedhash_input {

    public static void main(String[] args) {

        System.out.println("Enter the key to get value: ");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        LinkedHashMap<Integer, String> li = new LinkedHashMap<>();
        li.put(44, "aniket");
        li.put(45, "omkar");
        li.put(46, "vishal");
        li.put(47, "aadit");
        li.put(48, "adarsh");
        li.put(49, "rahul");

        if (li.containsKey(n)) {
            System.out.println(li.get(n));
        } else {
            System.out.println("Key not found");
        }

        s1.close();
    }
}

