//print the sum of element in givan array

#include<stdio.h>

int main(){
	int num[5];
	int i,sum=0;
	
	printf("enter the array element :");
	
	for(i=0;i<5;i++){   //user input upto 5
		scanf("%d",&num[i]);
	}
	for(i=0;i<6;i++){
		sum=sum+num[i];  //0+2=2
						//2+3=5
						//5+3=8
						//8+3=11
						//11+3=14
						//14+3=17
		
	}
	printf("sum %d",sum);
}
