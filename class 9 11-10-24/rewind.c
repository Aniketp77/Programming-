//rewind

#include<stdio.h>

int main(){
	FILE *fp;
	char c;
	fp = fopen("fillle.txt","r");
	
	while(c=getc(fp)!=EOF){
		printf("%s",c);
		
	}
	fclose(fp);
	
}
