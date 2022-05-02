#include <iostream>
#include <vector>
using namespace std;

int area(vector<int> v)
{
    return (v[3] - v[1]) * (v[2] - v[0]);
}

int intersect(vector<int> i, vector<int> k)
{
    return max(0, min(i[2], k[2]) - max(i[0], k[0])) * max(0, min(i[3], k[3]) - max(i[1], k[1]));
}

int main()
{
    freopen("billboard.in", "r", stdin);
    freopen("billboard.out", "w", stdout);

    vector<int> bb1(4), bb2(4), tr(4);
    for (int i = 0; i < 4; i++)
        cin >> bb1[i];
    for (int i = 0; i < 4; i++)
        cin >> bb2[i];
    for (int i = 0; i < 4; i++)
        cin >> tr[i];

    int total = area(bb1) + area(bb2) - intersect(bb1, tr) - intersect(bb2, tr);
    cout << total << endl;

    return 0;
}