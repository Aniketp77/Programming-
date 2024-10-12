#include<stdio.h>

void show(int num)
{
	printf("\nbefore adding valus %d",num);
	num= num=20;
	printf("\n after adding value %d",num);
}

int main()
{
	int a=10;
	printf("\nbefore calling fun: %d",a);
	show(a);
	printf("\n after adding value: %d",a);
}
