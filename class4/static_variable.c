#include<stdio.h>
void sum()
{
	
	static int i=10;
	printf("\t%d",i);
	i--;
	
	
}
void main(){
	sum();
	sum();
	sum();
}
