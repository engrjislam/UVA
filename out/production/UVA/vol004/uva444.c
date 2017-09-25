#include<stdio.h>
#include<string.h>
int main()
{
    char a[200];
    long long n,c=0,len,i,p,m;

while(gets(a)!=NULL)
    {
        len=strlen(a);
        for(i=len-1; i>=0; i--)
        {
            n=a[i];
            if(n>=48&&n<=57)
            {
                p=n-48;
                c=c*10+p;
                if(c>=65&&c<=90||c>=97&&c<=122||c==32||c==33||c==44||c==46||c==58||c==59||c==63)
                {
                    printf("%c",c);
                    c=0;
                }
            }
            else
            {
                while(n>0)
                {
                    c=n%10;
                    n=n/10;
                    printf("%lld",c);
                    c=0;
                }

            }
        }
        printf("\n");
}

    return 0;
}
