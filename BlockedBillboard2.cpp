#include <iostream>
#include <vector>

using namespace std;

int main()
{
    freopen("BlockedBillboard2.in", "r", stdin);
    freopen("BlockedBillboard2.out", "w", stdout);

    // ret area of tarp - intersection of tarp and second square
    // extra: coordinates may be negative
    // input: (x, y) (x, y) \n x y x y
    vector<int> tarp(4), feed(4);
    int A = 0;
    for (int i = 0; i < 4; i++)
        cin >> tarp.at(i);
    for (int i = 0; i < 4; i++)
        cin >> feed.at(i);
    A = (tarp.at(2) - tarp.at(0)) * (tarp.at(3) - tarp.at(1));
    int intersect = max(min(tarp.at(2), feed.at(2)) - max(tarp.at(0), feed.at(0)), 0) *
                    max(min(tarp.at(3), feed.at(3)) - max(tarp.at(1), feed.at(1)), 0);
    if (intersect != A)
        cout << A << endl;
    else
        cout << A << endl;
}