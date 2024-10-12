#include<stdio.h>

main()
{
	int a=1,b=2;
	printf("\nbefore swapping a =%d \n b =%d",a,b);
	
	b=b-a;
	a=b+a;
	
	
	//b=b-a;
	//a=b+a;
	//b=a-b;
	
	printf("\nbefore swapping a =%d \n b =%d",a,b);
}
