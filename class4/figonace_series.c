#include<stdio.h>

void main()
{
	//0 1 1 2 3 5 8.....
	int first=0, second=1, third=0;
	int i,r;
	
	printf("\nenter your range:");
	scanf("%d",& r);
	for(i=0;i<r;i++)
	{
		if(first < r)
		{
			printf("\n%d ",first);
		third = first + second;   //1 = 0+1
//		printf("%d",third);
		
		first = second;   //0=1   //first=1
//		printf("%d",first);
		
		second = third;
//		printf("%d",second);
		}
		else{
			break;
		}
	}
}

//  f s t
////0 1 1 2 3 5 8 
//    f s t
//      f s t
//        f s t
//          f s t



/*
125


521


hello
olleh*/
