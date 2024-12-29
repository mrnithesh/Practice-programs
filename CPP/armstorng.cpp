#include <iostream>
using namespace std;
bool isarmstrong(int a){
    int original,lastdigit;
    int sum=0;
    original=a;
    while (true){
        if (a==0) break;
        lastdigit=a%10;
        sum+=lastdigit*lastdigit*lastdigit;
        a=a/10;
    }
    if (original==sum) return true;
    else return false;
}

int main(){
    int n;
    cout<<"Enter the number : ";
    cin>>n;
    if (isarmstrong(n)){
        cout<<"It is armstrong number"<<endl;
    }
    else{
        cout<<"It is not an armstrong number"<<endl;
    }
}

