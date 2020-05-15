#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int k=(int)(n+(n/sqrt(n)));
  cout<<k+1;
}