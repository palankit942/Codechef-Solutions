#include <iostream>
using namespace std;

int main() 
{
	 int t;
	cin>>t;
	long  int x,y;
	while(t--)
	{
	    cin>>x>>y;
	    
	    if(y>x)
	    {
	        if((y-x)%2==1)
	        cout<<"1"<<endl;
	        else
	        {
	             if((y-x)%4!=0)
	             cout<<"2"<<endl;
	             else
	             cout<<"3"<<endl;
	        }
	    }
	    else if(y<x)
	    {
	        if((x-y)%2==1)
	        {
	            cout<<"2"<<endl; 
	        }
	        else
	        cout<<"1"<<endl;
	    }
	    else
	        cout<<"0"<<endl;
	}
	return 0;
}
