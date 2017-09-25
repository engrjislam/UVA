#include <iostream>
#include <cstdlib>

using namespace std;

int main ()
{
    long long a, b;
    while(cin >> a >> b)
    {
        if (cin.eof())
           return 0;
       cout << abs(a-b) << endl;
    }
}
