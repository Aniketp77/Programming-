#include<stdio.h>

void main()
{
    int num1, num2, result, choice;

    printf("\n enter number 1:");
    scanf("%d",&num1);

    printf("\n enter number 2:");
    scanf("%d",&num2);

    printf("/n 1.addition 2.substraction 3.multiplication 4.division");
    printf("\n enter your choice: ");
    scanf("%d,&choice:");

     switch(choice)
    {
        case 1:
        result = num1 + num2;
        printf("addition=%d",result);
        break;
        
        case 2:
          result = num1 - num2;
        printf("substraction=%d",result);
        break;

  case 3:
          result = num1 * num2;
        printf("multiplication=%d",result);
        break;

         case 4:
          result = num1 / num2;
        printf("devision=%d",result);
        break;
        
        default:
        printf("wrong case");

}
}