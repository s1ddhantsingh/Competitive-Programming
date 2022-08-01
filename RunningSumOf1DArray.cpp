#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    vector<int> runningSum(vector<int> &nums)
    {
        vector<int> ret(nums.size());
        for (int i = 0; i < nums.size(); i++)
        {
            int sum = 0;
            for (int k = 0; k <= i; k++)
            {
                sum += nums[k];
            }
            ret[i] = sum;
        }
        return ret;
    }
};