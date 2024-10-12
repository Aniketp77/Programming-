#include<stdio.h>

void main()
{
	int a=10, b=20;
	
	printf("\n before swapping a =%d and b =%d ",a,b);
	
//	temp = a;
//	a=b;
//	b=temp;

a = a + b; //30=10+20 // a=30
b = a-b;  //10=30-20  //b=10
a= a-b;   //20=30-10  //a=20
	
	printf("\n before swapping a =%d and b =%d ",a,b);
}
