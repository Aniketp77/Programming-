#include<stdio.h>
void main()
{
    char ch1;

    printf("enter the character:");
    scanf("%c",&ch1);

    if(ch1>='a' && ch1<='z')
    {
        printf("lower case character");

    }
    else if(ch1>='A' && ch1<='Z')
    {
        printf("upper case character");

    }
    else if (ch1>='0' && ch1<='9')
    {
        printf("digit");
    }


}