#include<stdio.h>

int main(){
int x, i;
double sum;
while(scanf("%d",&x) == 1){
sum = 0;
for(i=1;i<=x;i++)
sum += pow(i,3);
//printf("%.0f\n",sum);
printf("%d\n",x);
}
return 0;
}