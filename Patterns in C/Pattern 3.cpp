# include <stdio.h>
int main()
{
	int rows,space;
	printf("Enter No of Rows ");
	scanf("%d",&rows);
	
	for(int i=1, k=0; i<=rows; i++, k=0)
	{
		for(space=1; space<=rows-i; space++)
		{
			printf("  ");
		}
		while(k != 2*i-1)
		{
			printf("* ");
			k++;
		}
		printf("\n");
	} 
	return 0;
}
