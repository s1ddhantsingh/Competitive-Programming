#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s = "hello";
    cout << s.substr(0, abs(-1));
    return 1;
}
