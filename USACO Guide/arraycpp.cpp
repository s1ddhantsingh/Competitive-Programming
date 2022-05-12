#include <iostream>
#include <array>

using namespace std;

int main()
{
    array<char, 5> siddhant;
    siddhant[0] = 's';
    siddhant[1] = 'i';
    siddhant[3] = 'd';

    siddhant[6] = 'n'; // idk how this is possible...
    for (int i = 0; i < sizeof(siddhant) / sizeof(siddhant[0]); ++i)
        cout << siddhant[i] << " ";

    return 1;
}