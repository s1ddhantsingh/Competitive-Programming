#include <iostream>

using namespace std;

int main()
{
    freopen("paint.in", "r", stdin);
    freopen("paint.out", "w", stdout);

    int a, b, c, d, ans;
    cin >> a >> b >> c >> d;
    if (c > b || a > d)
        ans = (b - a) + (d - c);
    else
        ans = max(b, d) - min(a, c);
    cout << ans << endl;
    return 0;
}