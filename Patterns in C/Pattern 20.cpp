# include <stdio.h>
int main()
{
	int rows,space;
	char ch='A';
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
			printf("%c ",ch);
		}
		for(int j=0; j<i-1; j++)
		{
			printf("%c ",ch);
		}
		printf("\n");
		ch++;
	} 
	return 0;
}
