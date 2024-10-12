#include<stdio.h>

long int fact(int n); //declation of function


int main()
{
	int n;
	printf("enter a positive number:");
	scanf("%d",&n);
	printf("factorial of %d=%d",n,fact(n));
	return 0;
	
}

long int fact(int n)
{
	if(n>=1)
	return n*fact(n-1); //recursive function
	else
	return 1; //Base Function

}

