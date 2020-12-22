#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c,t;
    cin>>t;
    while(t--){
        cin>>a>>b>>c;
        if(a>b && a<c || a<b && a>c)
        cout<<a<<endl;
    if(b>c && b<a || b<c && b>a )
        cout<<b<<endl;
    if(c>a && c<b || c>b && c<a)
        cout<<c<<endl;
    }

}
