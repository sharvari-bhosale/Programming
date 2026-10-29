#include<stdio.h>     
   
void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)                             //Filter
    {
        printf("Invalid input\n");
        return;
    }
    for(iCnt = 0; iCnt <= iNo; iCnt++)
    {
        printf("%d\n",iCnt);
    }

}

int main()

{   
    int iCnt = 0;
    int iValue = 0;

    printf("Enter the frequecy: ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}