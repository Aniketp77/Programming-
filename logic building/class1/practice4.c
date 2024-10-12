//count the digit of 123456789

#include<stdio.h>

int main(){
	int num = 123456789;
	int count =0;
	printf("%d",num);
	
	while(num>0){
	
	num=num/10; //123456789/10 = >0 
	
	
	count++;
}
	printf("\tthe count of digit is : %d",count);
}
