//#include<stdio.h>
//int main(){
//	FILE *fp;
//	fp=fopen("file.text","w");
//	fprintf(fp,"hello c programing");
//	fclose(fp);
//	
//}


#include<stdio.h>
int main(){
	FILE *fp;
	
	char buff[200];
	fp=fopen("fille.txt","r");
	while(fscanf(fp,"%s",buff)!=EOF){
		printf("%s",buff);
		
	}
	fclose(fp);
	
}
