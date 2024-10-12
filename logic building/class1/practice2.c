//swap numbers using 3rd variable

#include<stdio.h>

int main()
{
	int a=4,b=6,temp;
	printf("\n%d%d",a,b);
	
	temp=b;
	b=a;
	a=temp;
	
	printf("\n%d%d",a,b);
		
}
