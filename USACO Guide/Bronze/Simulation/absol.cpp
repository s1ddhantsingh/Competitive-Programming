#include <iostream>

using namespace std;

int main()
{
    freopen("AliceAndBob.in", "r", stdin);
    freopen("AliceAndBob.out", "w", stdout);

    int r, s, m, n, p, q;
    cin >> r >> s >> m >> n >> p >> q;

    int ax = 0;
    int ay = 0; // alice's x and y coordinates
    int bx = r;
    int by = s; // bob's x and y coordinates
    int t = 0;  // keep track of the current time
    while (ax < bx && ay < by)
    {
        // every second, update alice's and bob's coordinates and the time
        ax += m;
        ay += n;
        bx -= p;
        by -= q;
        t++;
    }
    if (ax == bx && ay == by)
    {                      // if they are in the same location
        cout << t << endl; // they meet at time t
    }
    else
    {
        cout << -1 << endl; // they never meet
    }

    return 0;
}
