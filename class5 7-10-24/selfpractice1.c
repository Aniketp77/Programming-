#include <stdio.h>

// Function to calculate factorial using recursion
double factorial(double n) {
    if (n == 0 || n == 1) {
        return 1;  // Base case: factorial of 0 or 1 is 1
    } else {
        return n * factorial(n - 1);  // Recursive case
    }
}

int main() {
    double num;
    printf("Enter a number: ");
    scanf("%lf", &num);

    if (num < 0) {
        printf("Factorial of negative numbers is undefined.\n");
    } else {
        printf("Factorial of %.0lf is %.0lf\n", num, factorial(num));
    }

    return 0;
}
