#include <iostream>
using namespace std;


typedef long long int llint;


llint cycleLength(llint);
void show(llint l, llint h, llint value, llint max);

int main(){
llint l, h, temp, value, max;

int i;

while (cin >> l >> h){
if (l == 0 && h == 0) break;


if (l > h){
temp = l;
l = h;
h = temp;
}

value = 0;
max = 0;

for (i = l ; i <= h; i++){
temp = cycleLength(i);
if (temp > max) {
max = temp;
value = i;
}