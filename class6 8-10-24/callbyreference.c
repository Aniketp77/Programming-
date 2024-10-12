#include<stdio.h>

void show(int *num)									//facting the address of 'a' variable from main method.
{
	printf("\nbefore adding valus %d",*num);		//print before perform opration.
	*num= *num=20;									//Assigning the value and perform opration on 
	printf("\n after adding value %d",*num);		//print after perform opration.
}

int main()
{
	int a=10;									//declare as globel scop so we can use any whare in the program.
	printf("\nbefore calling fun: %d",a);		//print the value of a before calling function.
	show(&a);									//calling the show function and passes the parameter to show function
	printf("\n after adding value: %d",a);		//printing the value of a after calling function 
}
