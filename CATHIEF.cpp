#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    long long int k,n,x,y;
	    cin>>x>>y>>k>>n;
	    if(abs(x-y)%k)
	    {
	        cout<<"No"<<endl;
	    }
	    else if((abs(x-y)%(2*k))==0)
	    {
	        cout<<"Yes"<<endl;
	    }
	    else
	    {
	        cout<<"No"<<endl;
	    }
	}
	return 0;
}
