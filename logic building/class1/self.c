#include <stdio.h>

int main() {
    int num, sum = 0, digit;

    // Taking input from the user
    printf("Enter a number: ");
    scanf("%d", &num);

    // Loop to extract and sum each digit
    while (num != 0) {
        digit = num % 10;  // Extract the last digit
        sum += digit;      // Add the digit to the sum
        num = num / 10;    // Remove the last digit from the number
    }

    // Displaying the result
    printf("The sum of the digits is: %d\n", sum);

    return 0;
}

