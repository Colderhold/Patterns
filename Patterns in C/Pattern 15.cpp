#include<stdio.h>
int main()
{
	int i,j,k,n,l=1;
	printf("Enter No of Rows ");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		for(j=n-1; j>=i; j--)
		{
			printf(" ");
		}
		
		for(k=1; k<=l; k++)
		{ 
			printf("%d",k);
		}            
			l = l+2;    
	    printf("\n");
	}
    return 0;
}
