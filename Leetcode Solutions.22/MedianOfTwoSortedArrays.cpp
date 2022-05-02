#include <iostream>
#include <vector>
using namespace std;

double findMedianSortedArrays(vector<int> nums1, vector<int> nums2)
{
    /*
        Idea:
            1. Check the size of two arrays
            2. If size sum is odd then there IS a defined median
                ie. [1, 3, 5] [1, 2]
                     median: 1, 1, 2, 3, 5
                     number subsequently after sum / 2; 5 / 2 = 2
            3. If size sum is even then we need to calc. the median
                ie. [1, 3] [2, 5]
                    median: 1, 2, 3, 5 => (2 + 3) / 2 => 2.5
                    4 / 2 = 2 = index
                    and 2 - 1; index - 1
    */
    int s1 = sizeof(nums1);
    int s2 = sizeof(nums2);
    int sum = s1 + s2;
    double ret = 0.0;

    int a = 0, b = 0; // accessing the indexes of the different vectors

    if (sum % 2 != 0)
    { // odd subcase
        int reqIndex = sum / 2;
        for (int i = 0; i <= reqIndex; i++)
        {
            if (i == reqIndex)
            {
                ret = min(nums1[a], nums2[b]);
                if (nums1[a] < nums2[b])
                    a++;
                else
                    b++;
                break;
            }
            else if (nums2[b] < nums1[a])
                b++;
            else
                a++;
        }
    }
    else
    {
        int reqIndex = sum / 2;
        for (int i = 0; i < reqIndex; i++)
        {
            if (i == reqIndex - 1)
            {
                ret = min(nums1[a], nums2[b]);
                if (nums1[a] < nums2[b])
                    a++;
                else
                    b++;
                break;
            }
            else if (nums2[b] < nums1[a])
                b++;
            else
                a++;
        }
        ret = (ret + min(nums1[a], nums2[b])) / 2;
    }

    return ret;
}

int main()
{
    cout << "Starting program!" << endl;
    vector<int> v1;
    v1.push_back(1);
    v1.push_back(2);
    v1.push_back(3);

    vector<int> v2;
    v1.push_back(4);
    v1.push_back(5);
    v1.push_back(6);

    cout << findMedianSortedArrays(v1, v2) << endl;

    return 0;
}