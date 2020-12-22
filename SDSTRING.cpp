#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        
        if(s.length()%2 != 0) cout << "-1" << endl;
        else{
            int cont_0=0,cont_1=0;
            for(int i=0; i<s.length(); i++){
                if(s[i] == '0') cont_0++;
            }
            cont_1 = s.length()-cont_0;
            
            if(cont_0 == 0 || cont_1==0){
                cout << "-1"<<endl;
            }
            else{
                int diff = abs(cont_1-cont_0);
                 cout << diff/2<<endl;
            }
        }
    }
    return 0;
}
