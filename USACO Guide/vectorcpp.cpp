#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<char> v(10);
    v.at(0) = '1';
    v.at(1) = 's';
    v.at(9) = 'l';
    for (int i = 0; i < v.size(); i++)
        cout << v.at(i) << " ";
    cout << endl;
    for (vector<char>::iterator it = v.begin(); it != v.end(); ++it)
        cout << *it << " ";
    cout << endl;
    for (auto it = v.begin(); it != v.end(); it = next(it))
        cout << *it << " ";
    cout << endl;
    for (char c : v)
        cout << c << " ";
    cout << endl;

    vector<int> vi = {1, 2, 3, 4, 5, 6, 7};
    for (vector<int>::iterator it = vi.begin(); it != vi.end(); ++it)
        cout << *it << " ";

    cout << endl
         << endl;
    for (int i : vi)
        cout << i << " ";
    for (int i = vi.size() - 1; i >= 0; --i)
        vi.erase(vi.begin() + i);
    cout << endl
         << endl;
    for (int i : vi)
        cout << i << " ";
    return 1;
}