#include <iostream>
#include <vector>
using namespace std;

int main()
{
    freopen("squarePasture.in", "r", stdin);
    freopen("squarePasture.out", "w", stdout);

    vector<int> r1(4), r2(4);
    for (int i = 0; i < 4; i++)
        cin >> r1[i];
    for (int i = 0; i < 4; i++)
        cin >> r2[i];

    int A = (r1.at(2) - r1.at(0)) * (r1.at(3) - r1.at(1)) + (r2.at(2) - r2.at(0)) * (r2.at(3) - r2.at(1));
    // intersection
    A -= max(min(r1.at(2), r2.at(2)) - max(r1.at(0), r2.at(0)), 0) * max(min(r1.at(3), r2.at(3)) - max(r1.at(1), r2.at(1)), 0);
    cout << A * A << endl;
}