#include <iostream>
#include <vector>

using namespace std;

int main()
{
    freopen("BucketE-2.in", "r", stdin);
    freopen("BucketE-2.out", "w", stdout);

    int n;
    cin >> n;
    vector<int> b(n);
    vector<int> c(n);
    for (int i = 0; i < n; ++i)
        cin >> c[i];
    for (int i = 0; i < n; ++i)
        cin >> b[i];

    for (int i = 0; i < n - 1; ++i)
    {
        int amt = min(c[i + 1] - b[i + 1], b[i]);
        b[i] -= amt;
        b[i + 1] += amt;
    }

    for (int i = 0; i < n; ++i)
        cout << b[i] << " ";

    cout << endl;
}