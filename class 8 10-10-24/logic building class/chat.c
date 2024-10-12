//#include <stdio.h>
//
//int main() {
//    char ch = 'A';  // Initialize the character to 'A'
//    int i, j;       // Declare loop variables outside the loop (C89 compatible)
//
//    // Loop through rows (4 rows in total)
//    
//    for (i = 0; i < 4; i++) {
//        // Loop through columns (4 columns per row)
//        for (j = 0; j < 4; j++) {
//            printf("%c", ch);  // Print the current character
//            ch++;              // Move to the next character
//        }
//        printf("\n");  // Move to the next line after each row
//    }
//
//    return 0;
//}


#include <stdio.h>

int main() {
    int a = '1';  // Initialize the character to 'A'
    int i, j;       // Declare loop variables outside the loop (C89 compatible)

    // Loop through rows (4 rows in total)
    for (i = 0; i < 4; i++) {
        // Loop through columns (4 columns per row)
        for (j = 0; j < 4; j++) {
            printf("%c",a);  // Print the current character
            a++;              // Move to the next character
        }
        printf("\n");  // Move to the next line after each row
    }

    return 0;
}


