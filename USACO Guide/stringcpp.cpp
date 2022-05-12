#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s = "hello there";
    s.push_back('!');
    for (auto it = s.begin(); it != s.end(); ++it) // regular string iteration
        cout << *it << endl;
    cout << s << endl;

    for (auto it = s.end(); it >= s.begin(); --it) // reverse iteration
        cout << *it << endl;
    cout << s << endl;

    string a = "a";
    string b = "b";
    cout << a << b;
    swap(a, b);
    cout << a << b;
}