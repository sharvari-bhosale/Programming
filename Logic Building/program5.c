/*
Algorithm:

    START
        Accept first number as no1
        Accept second number as no2
        Perform addition of no1 and no2
        Display the result
    STOP
*/

#include<stdio.h>

int main()
{
    float i,j,k;    //change datatype

    printf("Enter first number: \n");
    scanf("%f",&i);

    printf("Enter second number: \n");
    scanf("%f",&j);

    k = i + j;

    printf("Addition is : %f\n",k);

    return 0;
}