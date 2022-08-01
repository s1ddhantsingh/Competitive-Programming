#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    int finalValueAfterOperations(vector<string> &operations)
    {
        int x = 0;
        for (int i = 0; i < operations.size(); i++)
        {
            if (operations[i].compare("--X") == 0 || operations[i].compare("X--") == 0)
                --x;
            else
                x++;
        }
        return x;
    }
};