#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    string maskPII(string s)
    {
        bool isE = false;
        char prev;
        string dom;
        for (int i = 0; i < s.length(); i++)
            if (s.at(i) == '@')
            {
                isE = true;
                prev = s.at(i - 1);
                dom = s.substr(i + 1, s.length() - 1);
                break;
            }
        if (isE)
        {
            string ret = "";
            transform(dom.begin(), dom.end(), dom.begin(), ::tolower);
            ret.append("" + tolower(s.at(0)) + "*****" + tolower(prev) + dom);
        }
        // implement phone methods
        else
        {
        }

        return ret;
    }
};