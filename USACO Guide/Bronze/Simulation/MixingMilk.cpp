#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

using ll = long long;

using vi = vector<int>;
#define pb push_back
#define all(x) begin(x), end(x)
#define sz(x) (int)(x).size()

using pi = pair<int, int>;
#define f first
#define s second
#define mp make_pair

void setIO(string name = "")
{
    cin.tie(0)->sync_with_stdio(0); // see /general/fast-io
    if (sz(name))
    {
        freopen((name + ".in").c_str(), "r", stdin); // see /general/input-output
        freopen((name + ".out").c_str(), "w", stdout);
    }
}

int main()
{
    setIO("MixingMilk");
    vector<ll> c(3); // capacity
    vector<ll> a(3); // amount

    for (int i = 0; i < 3; i++)
        cin >> c[i] >> a[i];

    for (int i = 0; i < 100; i++)
        // 1 cycle
        for (int j = 0; j < 4; j++)
        {
            int amt = min(c[(j + 1) % 3] - a[(j + 1) % 3], a[(j) % 3]);
            a[(j) % 3] -= amt;
            a[(j + 1) % 3] += amt;
        }

    for (int i = 0; i < 3; i++)
        cout << a[i] << " ";
}
