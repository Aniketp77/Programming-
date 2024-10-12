//user ip and find largest number

#include<stdio.h>

int main(){
	int a,b,c;
	
	printf("enter any 1st number");
	scanf("%d",&a);
	
	printf("enter any 2st number");
	scanf("%d",&b);
	
	printf("enter any 3st number");
	scanf("%d",&c);
	
	if(a>b&&a>c){
		printf("the largest number is : %d",a);
	}
	else if(b>a&&b>c){
		printf("the largest number is : %d",b);
	}
		
	else{
		printf("the largest number is : %d",c);
	}
	
}
