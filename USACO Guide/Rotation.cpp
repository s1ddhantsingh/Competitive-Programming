#include <iostream>
#include <string>

using namespace std;

int main()
{
    freopen("Rotation.in", "r", stdin);
    string s;
    cin >> s;

    int rshift = 0, lshift = 0;
    char x;
    while (cin >> x)
        (x == 'R') ? ++rshift : ++lshift;

    int shift = (rshift - lshift);
    shift < 0 ? shift = -1 * (abs(shift) % s.length()) : shift %= s.length();

    cout << rshift << endl
         << lshift << endl
         << shift << endl;
    // modded by s.length that way we get a shift factor less than the size of the string s.
    // if shift is (-) then lshift is greater
    /*
        ie. "hello"; shift = -1;
            hello -> elloh
            "hello"; shift = 1;
            hello -> ohell
    */

    if (shift < 0)
    {
        // left shift subcase
        string pre = s.substr(0, abs(shift));
        string end = s.substr(abs(shift));

        s = end + pre;
    }
    else
    {
        string post = s.substr(s.length() - shift - 1);
        string front = s.substr(0, s.length() - shift - 1);

        s = post + front;
    }

    cout << s << endl;
    return 1;
}