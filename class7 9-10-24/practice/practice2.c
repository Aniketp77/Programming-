//count the number of vowel in a string.a e i o u 
//count the special char in a string. //!@#$%^&*

//#include<stdio.h>
//
//int main(){
//	
//	char str[20];
//	int i,count=0;
//	
//	printf("enter the string : ");
//	gets(str);
//	
//	while(str[i]!='\0'){
//		if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')
//		count++;
//		i++;
//	}
//	printf("number of vowels in the string=%d",count);
//}

#include<stdio.h>

int main(){
	
	char str[20];
	int i,count=0;
	
	printf("enter the string : ");
	gets(str);
	
	while(str[i]!='\0'){
		if(str[i]=='!'||str[i]=='@'||str[i]=='#'||str[i]=='$'||str[i]=='%'||str[i]=='^'||str[i]=='&'||str[i]=='*'||str[i]=='('||str[i]==')')
		count++;
		i++;
	}
	printf("number of vowels in the string=%d",count);
}
