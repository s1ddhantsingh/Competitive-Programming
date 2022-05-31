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
    setIO("ShellGame");
    int n;
    cin >> n;

    // three shells {1, 2, 3}
    // n swaps <- each time do:
    // 1. swap (a, b)
    // 2. guess == g
    vector<int> counter(3);
    vector<int> sp(3);
    for (int i = 0; i < 3; i++)
        sp[i] = i;
    for (int i = 0; i < n; ++i)
    {
        int a, b, g;
        cin >> a >> b >> g;
        --a, --b, --g;
        swap(sp[a], sp[b]);
        ++counter[sp[g]];
    }
    cout << max({counter[0], counter[1], counter[2]}) << endl;
    // cout << max(counter[0], max(counter[1], counter[2])) << endl;
}