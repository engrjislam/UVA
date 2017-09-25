#include<stdio.h>
#include<string.h>
int main()
{
    char aa[1000];
    int b,i,len;
    while(gets(aa)!=NULL)
    {
        len=strlen(aa);
        for(i=0; i<len; i++)
        {
            b=aa[i];
            printf("%c",b-7);
        }
        printf("\n");
    }
    return 0;
}
