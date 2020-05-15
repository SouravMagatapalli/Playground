#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
  getline(cin,fnum);
  
  float a=fnum.find(".");
  
	cout<<"Floating part is : ";
      for(auto i=fnum.begin()+a+1;i<fnum.end();i++){
      cout<<*i;
      }
}