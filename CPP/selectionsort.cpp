#include <bits/stdc++.h>
using namespace std;
int selectionsort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i;j<n-2;j++){
            if (arr[j]<arr[min]){
                min=j;
            }
        }
        int temp= arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    cout<<"The array after sorting is "<<" ";
    for (int i=0; i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
int main(){
    int n;
    int arr[5];
    cout<<"Enter the number of elements :";
    cin>>n;
    for (int i=0;i<n;i++) {
        cin>>arr[i];
    }
    selectionsort(arr,n);

}