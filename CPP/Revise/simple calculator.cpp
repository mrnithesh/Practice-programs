#include <iostream>
using namespace std;
int main(){
    cout<<"Calculator program"<<"\n";
    int a,b;
    int i=1;
    char op;
    while(i==1)
    {
        cout<<"Enter the value of a :";
        cin>>a;
        cout<<"Enter the value of b :";
        cin>>b;
        cout<<"Enter the operation u need to perform (+,-,*,/)";
        cin>>op;
        switch (op){
            case '+':
            cout<<a+b;
            break;
            case '-':
            cout<<a-b;
            break;
            case '*':
            cout<<a*b;
            break;
            case '/':
            cout<<a/b;
            break;
            default:
            cout<<"Enter a valid operation"<<"\n";
            break;
            }
        cout<<"\n Do you want to continue? if yes enter 1 : ";
        cin>>i;
    }
    return 0;
}