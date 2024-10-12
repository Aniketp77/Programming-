#include<stdio.h>

	int add(int a, int b){
		int c;
		return c;
	}

int main(){
	int a,b,p;
	int (*p(int,int));  // declare fun pointer
	
	int result;
	
	printf("enter the valuue :");
	scanf("%d%d",&a,&b);
	
	p=add;		//assignin the address of aadd function
	
	result=(*p)(a,b);		//function calling
	printf("adiition:%d",result);
	

	
}
