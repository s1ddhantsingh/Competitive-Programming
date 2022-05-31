#include <iostream>

using namespace std;

int main()
{
    freopen("AliceAndBob.in", "r", stdin);
    freopen("AliceAndBob.out", "w", stdout);

    int r, s, m, n, p, q;
    cin >> r >> s >> m >> n >> p >> q;
    int ax = 0, ay = 0, bx = r, by = s;
    int t = 0;
    while (bx > ax && by > ay)
    {
        ax += m;
        ay += n;
        bx -= p;
        by -= q;
        ++t;
    }
    if (ax == bx && ay == by)
        cout << t << endl;
    else
        cout << -1 << endl;
}