#include<stdio.h>
int main()
{
	FILE * fPointer;
	fPointer = fopen("file2.txt","r");
	//store sth such as character arrays
	char singleLine[150];
	
	while(!feof(fPointer))		//it going to run until the end of the file
	{
		fgets(singleLine, 150,fPointer);		//get it to the file line by line 
		puts(singleLine);				//it gonna put what ever in the single line in the command promp
	}
	
	fclose(fPointer);
	return 0;
}
