#include <iostream>
using namespace std;

int main(){

char string[] = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;\'ZXCVBNM,./";
char input[200];
int i, j;
int flag;

while (cin.getline(input, sizeof(input))){
for (i = 0; input[i] != '\0'; i++){
flag = 0; 
for (j = 0; string[j] != '\0'; j++){
if (input[i] == string[j]){
cout << string[j-1]; 
flag = 1; 
break;
}
}
if (flag == 0) cout << input[i];
}
cout << endl;
}
return 0;
}