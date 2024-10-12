////fputc() and fgetc()
//#include<stdio.h>
//
//int main(){
//
//FILE *fp;
//
//fp=fopen("fillle.txt","w");  //opning file
//fputs("hello c programing ",fp);
//
//fclose(fp);
//}


#include<stdio.h>
int main(){
	FILE *fp;
	char text[200];
	fp = fopen("fillle.txt","r");
	printf("%s",fgets(text,150,fp));
	fclose(fp);
}
