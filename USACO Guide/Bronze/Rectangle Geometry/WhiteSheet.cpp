#include <iostream>
#include <vector>

using namespace std;

int intersect(vector<int> a, vector<int> b)
{
    return max(min(a[2], b[2]) - max(a[0], b[0]), 0) *
           max(min(a[3], b[3]) - max(a[1], b[1]), 0);
}

int area(vector<int> a)
{
    return (a[2] - a[0]) * (a[3] - a[1]);
}

int main()
{
    freopen("WhiteSheet.in", "r", stdin);
    freopen("WhiteSheet.out", "w", stdout);

    // return if white is viewable
    vector<int> white(4), black1(4), black2(4);
    for (int i = 0; i < 4; i++)
        cin >> white.at(i);
    for (int i = 0; i < 4; i++)
        cin >> black1.at(i);
    for (int i = 0; i < 4; i++)
        cin >> black2.at(i);
    // white A - ( intersect(black 1, white) + intersect(black 2, white) - intersect(black 1, black 2) );
    cout << (area(white) - (intersect(white, black1) + intersect(white, black2) - intersect(black1, black2)) == 0 ? "NO" : "YES") << endl;
}