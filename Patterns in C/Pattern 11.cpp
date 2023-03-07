# include <stdio.h>
int main()
{
	int i,n,c=1;
	printf("Enter No of Rows ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		if(i==1)
		{
			c=i;
		}
		else
		{
			c=c*11;
		}
		printf("%d ",c);
		printf("\n");
	}
	return 0;
}
