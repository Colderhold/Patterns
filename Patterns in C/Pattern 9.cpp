# include <stdio.h>
int main()
{
	int i,j,n;
	printf("Enter No of Rows ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		for(j=1;j<=n;j++)
		{
			printf("%d ",j);
		}
		printf("\n");
	}
	return 0;
}
