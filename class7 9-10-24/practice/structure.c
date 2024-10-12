
////structure and union
//#include<stdio.h>
//
//	struct emp{
//		int id;
//		char name[10]; //also called string
//		
//	}e1,e2;
//
//int main(){
//	e1.id=1;
////	e1.name="ram";
//	strcpy(e1.name,"ram");
//	
//	printf("id:%d",e1.id);
//	printf("\n name : %s",e1.name);
//}


// union
#include<stdio.h>

	union emp{
		int id;
		char name[10]; //also called string
		
	}e1,e2;

int main(){
	e1.id=1;
//	e1.name="ram";
	strcpy(e1.name,"ram");
	
	printf("id:%d",e1.id);
	printf("\n name : %s",e1.name);
}
