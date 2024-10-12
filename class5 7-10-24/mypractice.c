#include<stdio.h>

double factorial(num); // declaration

void main(){
	int n;
	printf("enter positive number");
	scanf("%ld",&n);
	printf("factorial of %ld=%ld ",n,factorial(n));
	
}

double factorial(int num)
{
	if(num>=1)
	return num * factorial(num-1);
	else
	return 1;
	
}
