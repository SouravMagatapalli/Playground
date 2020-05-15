#include <iostream>
using namespace std;
int main() {
  int n,u=1,v,w,f;
  cin>>n;
  v=n*(n+1);
  v=v-(n-1);
  w=f=n;
  f--;
  for(int i=0;i<n;i++){
      for(int j=1;j<=2*i;j++){
          cout<<"-";
      }
    for(int k=1;k<=w;k++){
        cout<<u<<"*";
        u++;
    }
    
    for(int l=1;l<=w;l++){
        cout<<v;
        if(l!=w) cout<<"*";
        v++;
        
    }
    v--;
    v=v-2*(f);
    f--;
    w-=1;
  
    cout<<"\n";  
  }
}