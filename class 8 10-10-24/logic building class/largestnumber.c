//check the largest number among threee number

#include<stdio.h>

int main(){
	int a=3,b=4,c=5;
	
	if(a>b&&a>c){     //3>4 true && 3>5 true
		printf("the largest number is :%d",a);
		
	}
	
	else if(b>a&&b>c){	//
		printf("the largest number is : %d",b);
	}
		
	else{
			printf("the largest number is : %d",c);
		}
}
