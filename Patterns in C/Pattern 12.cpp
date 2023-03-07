# include <stdio.h>
int main()
{
	int i,j,k,n;
	printf("Enter No of Rows ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		for(j=n-1;j>=i;j--)
		{
			printf(" ");
		}
		for(k=i;k>=1;k--)
		{
			printf("%d ",k);
		}
		printf("\n");
	}
	return 0;
}
