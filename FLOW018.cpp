#include <iostream>
using namespace std;


int main() {
	// your code goes here
int t;
    cin >> t;
    for (int x = 0; x < t;x++)
    {
        int num, factorial = 1;
        cin >> num;
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        cout << factorial << endl;
    }
}
