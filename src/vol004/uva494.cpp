
#include <iostream>
using namespace std;

int main(){
char c;
bool flag = false;
int words = 0;

c = cin.get();
while (!cin.eof()){

while (c != '\n'){
if (( c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
if (!flag){

flag = true;
words++;
}
}
else
flag = false;

c = cin.get();
}

cout << words << endl;
words = 0;
flag = false;
c = cin.get();
}

return 0;
}
