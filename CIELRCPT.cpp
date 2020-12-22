#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int count=0;
        for (int  i  = 11; i>=0; i--)
        {
            int m=pow(2,i);
            if (n-m >=0)
            {
                n-=m;
                i++;
                count+=1;
            }
            
        }
        cout<<count<<endl;
    }
    
return 0;
}
