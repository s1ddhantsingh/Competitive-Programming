#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    bool isPalindrome(string s)
    {
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        // s.erase(remove(s.begin(), s.end(), ' '), s.end());
        auto it = remove_if(s.begin(), s.end(), [](char const &c)
                            { return !isalnum(c); });

        s.erase(it, s.end());
        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.at(i) != s.at(s.length() - i - 1))
                return false;
        }
        return true;
    }
};