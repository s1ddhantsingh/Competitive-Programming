// clang++ -std=c++17 -o DigitQueries DigitQueries.cpp && ./DigitQueries
#include <iostream>
#include <vector>
#include <string>

using namespace std;

#define ull unsigned long long

string s;

void create(ull max)
{
    for (ull n = 0; n <= max; ++n)
        s += to_string(n);
}

int main()
{
    int q;
    cin >> q;
    ull max = 0;
    vector<ull> listOfK;
    while (q--)
    {
        ull k;
        cin >> k;
        listOfK.push_back(k);
        if (k > max)
            max = k;
    }

    create(max);

    for (ull k : listOfK)
        cout << s[k] << endl;
};