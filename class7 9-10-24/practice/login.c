#include<stdio.h>

int main()
{
	char name[20];
	char pass[20];
	
	
	printf("enter your user name :");
	gets(name);
	
	printf("enter your pass");
	gets(pass);
	
	if(strcmp(name,"xyz")==0 && strcmp(pass,"abc")==0){
		printf("login successful");
		
	}
	
	else{
		printf("invalid");
	}
}
