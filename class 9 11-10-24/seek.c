//fseek()

#include<stdio.h>
int main(){
	FILE *fp;
	fp = fopen("fillle.txt","w+");
	fputs("hello learners ",fp);
	fseek(fp,7,SEEK_SET);
	fputs("you are aniket ",fp);
	fclose(fp);
	
}
