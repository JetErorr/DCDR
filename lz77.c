#include<stdio.h>
#include<conio.h>

int main()
{
	char a[10] ="abracad";
	char sb[7],lb[5];
	int i,j,cnt=0,c=0;
	for(i=0;i<5;i++)
	{
		lb[i]=a[i];
    }
	sb[0]=lb[0];
	printf("<0,0,%c>",sb[0]);

	for(i=0;i<5;i++)
	{
		lb[i]=lb[i+1];
	}
	lb[4]=a[5];
	sb[1]=lb[0];
	printf("\n<0,0,%c>",sb[1]);

	for(i=0;i<5;i++)
	{
		lb[i]=lb[i+1];
	}
	lb[4]=a[6];
	sb[2]=lb[0];
	printf("\n<0,0,%c>",sb[2]);

	for(i=0;i<5;i++)
	{
		lb[i]=lb[i+1];
	}
	lb[4]=a[7];
	for(i=0;i<5;i++)
	{
		if(sb[i]==lb[0])
		{
			c=i;
			cnt++;
		}
	}
	printf("\n<%d,%d,%c>",c,cnt,lb[c+1]);

	cnt=0;
	sb[3]=lb[c];
	sb[4]=lb[c+1];
	for(i=2;i<5;i++)
	{
		lb[i-2]=lb[i];
	}
	lb[2]='\0';
	lb[3]='\0';
	lb[4]='\0';
	for(i=0;i<5;i++)
	{
		if(sb[i]==lb[0])
		{
			c=i;
			cnt++;
		}
	}
	printf("\n<%d,%d,%c>",c,cnt-1,lb[cnt-1]);
	getch();
}
