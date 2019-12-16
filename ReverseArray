#include<stdio.h>

int* reverseArray(int size,int *a)
{
	int i,temp;
	int len = size-1;
	for(i=0;i<(size/2);i++)
	{
		temp=a[i];
		a[i]=a[len-i];
		a[len-i]=temp;
	}
	return a;
}

int main()
{
	int a[1000],size,i;

	scanf("%d",&size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
	reverseArray(size,a);
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
	return 0;
}
