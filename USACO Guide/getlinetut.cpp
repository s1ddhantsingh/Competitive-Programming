#include <iostream>
#include <string>
#include <vector>

using namespace std;

#define my_brain_hurts freopen("getlinetut.in", "r", stdin)

int main()
{
    my_brain_hurts;
    string s{}; // string initialization in cpp
    // getline(cin, s);
    getline(cin >> ws, s);

    cout << s << endl;

    vector<int> vi(6);
    for (int i = 0; i < vi.size(); i++)
        vi.at(i) = i;

    vi.erase(vi.begin());

    for (int v : vi)
        cout << v << " ";

    for (char c : s)
        cout << c;

    cout << s[s.length() - 1];
    return 1;
}