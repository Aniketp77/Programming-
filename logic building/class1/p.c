#include<stdio.h>
int main(){
	
	int i,sum,a;
	printf("enter the number");
	scanf("%d",a);
	while(a>0){
		i=a%10;
		sum=sum+i;
		a=a/10;
	}
	printf("Hello");
//	for(i=0;i<=a;i++)
//	{
//		sum=sum+i;
//		
//	}
//	printf("SUm is %d",a);
	return 0;
}

