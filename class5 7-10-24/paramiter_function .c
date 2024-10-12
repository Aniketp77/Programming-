#include<stdio.h>
#include<conio.h>

int c; //globel



void addition(int a,int b){
     c=a+b;
     printf("addition=%d",c);
}


void main()
{
     int num1, num2; //local variable 
     printf("Enter two numbers");
     scanf("%d%d",&num1,&num2);
     addition(num1,num2);
     

}




