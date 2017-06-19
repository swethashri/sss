#include<stdio.h>
#include<conio.h>
int main(){
int leapyear;
printf("enter the year");
scanf("%d",&leapyear);
if(leapyear%4==0)
printf("%d is leap year",leapyear);
else
printf("%d is not leap year",leapyear);
return 0;
}
