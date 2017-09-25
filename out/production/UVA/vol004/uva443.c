#include<stdio.h>
#define M 5843
#define min(a,b)  (a<b? a:b)

long humble[M];
void genHumble();

int main()
{
    register int n;
   

    genHumble();
    while(scanf("%d",&n)&&n)
    {
        if((n%100)/10==1)
        {
            printf("The %dth humble number is %d.\n",n,humble[n]);
            continue;
        }

        switch(n%10)
        {
        case 1:
            printf("The %dst humble number is %d.\n",n,humble[n]);
            break;
        case 2:
            printf("The %dnd humble number is %d.\n",n,humble[n]);
            break;
        case 3:
            printf("The %drd humble number is %d.\n",n,humble[n]);
            break;
        default:
            printf("The %dth humble number is %d.\n",n,humble[n]);
        }
    }
    return 0;
}

void genHumble()
{
    register int a,b,c,d,i;
    register long w,x,y,z;

    humble[1]=a=b=c=d=1;

    for(i=2;i<M;i++)
    {
        w=2*humble[a];
        x=3*humble[b];
        y=5*humble[c];
        z=7*humble[d];

        humble[i]=min(min(w,x),min(y,z));

        if(humble[i]==w)a++;
        if(humble[i]==x)b++;
        if(humble[i]==y)c++;
        if(humble[i]==z)d++;
    }
}