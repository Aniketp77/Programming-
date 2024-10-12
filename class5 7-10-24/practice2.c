#include<stdio.h>

double fact(double n); //declation of function


int main()
{
	double num;
	printf("enter a positive number:");
	scanf("%lf",&num);
	
	printf("factorial of %d=%d",num,fact(num));
	return 0;
	
}

double fact(double n)
{
	if(n>=1)
	return n*fact(n-1); //recursive function
	else
	return 1; //Base Function

}
