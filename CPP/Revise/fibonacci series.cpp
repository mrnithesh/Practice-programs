#include<iostream>
using namespace std;
int main(){
    cout<<"Program to print n fibannoci series"<<endl;
    int a=0, b=1, c, n;
    cout<<"Enter the value of n: "<<;
    cin>>n;
    cout<<a<<" "<<b<<" ";
    for (int i=3;i<=n;i++){
        c=a+b;
        cout<<c<<" ";
        a=b;
        b=c;
    }
    return 0;
}