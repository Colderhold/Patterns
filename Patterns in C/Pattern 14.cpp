#include<stdio.h>
int main()
{
	int i,j,n;
	printf("Enter No of Rows ");
	scanf("%d",&n);
	int space=n-1;
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<space;j++)
		{
			printf(" ");
		}
		for(j=0;j<=i;j++)
		{
			printf("* ");
		}
		
		printf("\n");
		space--;
	}
	space=0;
	for(i=n;i>0;i--)
	{
		for(j=0;j<space;j++)
		{
			printf(" ");
		}
		for(j=0;j<i;j++)
		{
			printf("* ");
		}	
		printf("\n");
		space++;
	}
    return 0;
}
