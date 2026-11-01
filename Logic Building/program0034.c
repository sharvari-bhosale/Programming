#include<stdio.h>     
   
void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)                             //Filter
    {
        printf("Invalid input\n");
        return;
    }
    for(iCnt = iNo; iCnt >= 0; iCnt--)       //decrement(5 4 3 2 1 0)
    {
        printf("%d\n",iCnt);
    }

}

int main()

{    
    int iValue = 0;

    printf("Enter the frequecy: ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}