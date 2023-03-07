# include <stdio.h>
int main()
{
	int rows,space;
	printf("Enter No of Rows ");
	scanf("%d",&rows);
	
	for(int i=rows; i>=1; i--)
	{
		for(space=0; space<rows-i; space++)
		{
			printf("  ");
		}
		for(int j=i; j<=2*i-1; j++)
		{
			printf("%d ",j);
		}
		for(int j=1; j<i; j++)
		{
			printf("%d ",j);
		}
		printf("\n");
	} 
	return 0;
}
