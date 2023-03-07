#include<stdio.h>
int main()
{
    int i,j,n;
    int space=0;
    printf("Enter No of Rows ");
	scanf("%d",&n);
	
    for(i=n; i>=1; i--)
    {
        for(j=1; j<=space; j++)
            printf(" ");

        for(j=1; j<=i; j++)
            printf("%d",j);
        
        for(j=i-1; j>=1; j--)
            printf("%d",j);
            
        printf("\n");
        space++;
    }
    return 0;
}
