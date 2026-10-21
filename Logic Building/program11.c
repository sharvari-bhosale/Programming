/*
Algorithm :

START 
    Accept the number as No
    If the No is completely divisible by 2
        then print even
    otherwise
        print odd    
STOP  


START
    Accept the number as No
    Divide No by 2
    If remainder is 0
        then print as even
    otherwise
        print as odd    
STOP
*/

#include<stdio.h>

int main()
{
    int iValue = 0;
    int iRemainder = 0;

    printf("Enter number: ");
    scanf("%d",&iValue);

    iRemainder = iValue % 2;

    if(iRemainder == 0)
    {
        printf("Number is even\n");
    }
    else
    {
        printf("Number is odd");
    }

    return 0;
}