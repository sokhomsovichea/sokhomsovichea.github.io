#include<stdio.h>
int main()
{
	FILE * fPointer;
	fPointer = fopen("file2.txt","w");
	fprintf(fPointer,"roses are red \nviolet are blue \nthe star tonight are so bright \nbut not as beautiful as you");
	fclose(fPointer);
}
