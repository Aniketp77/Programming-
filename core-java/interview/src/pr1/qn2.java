package pr1;

import java.util.*;

public class qn2 {

	public static void main(String[] args) {
		int it = 0;
        int a[][] = {{60, 22, 98}, {56, 76, 66}};
        int r = a.length;
        int c = a[0].length;
        int b[] = new int[r * c];
        
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[it] = a[i][j];
                it++;
            }
        }
        
//        System.out.println(b);
        for(int i=0;i<b.length;i++) {
        	System.out.println(b[i]);
        }
	}
}
//60 22 98
//56 76 66