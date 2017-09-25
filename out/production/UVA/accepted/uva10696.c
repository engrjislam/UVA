#include<stdio.h>
long long f91(long long n){
if(n>=101)
return n-10;
else
return f91(f91(n+11));
}
int main(){
long long n;
while(scanf("%lld",&n)){
if(n==0)
break;
else
printf("f91(%lld) = %lld\n",n,f91(n));
}
return 0;
}