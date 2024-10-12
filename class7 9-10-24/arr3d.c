#include<stdio.h>

int main(){
	int num[2][3][2]={{{1,2},{2,3},{3,4}},{{4,5},{5,6},{6,7}}};
	
	int i,j,k;
	for(i=0;i<2;i++){
		for(j=0;j<3;j++);{
			for(k=0;k<2;k++){
			
			printf("%d",num[i][j][k]);
			
		}
		printf("\n");
		
	}
	printf("\n");
}
}
