#include <stdio.h>
#include <stdlib.h>
#define SIZE 10 
int i,pos,el
void printlist(int a[]){
    printf("The elements in the list are");
    for (i = 0; i < SIZE; i++)
    {
        printf(" %d ",a[i]);
    }
    printf("\n");
}
void insertat(int a[],int el, int pos){
    if (pos>=0 && pos<SIZE)
    {
        for ( i = SIZE; i>pos; i--)
        {
        a[i]=a[i-1];
        }
        a[pos]=el;
        printf("The element %d is inserted in the postion %d \n",el,pos);
        printlist(a);      
    }
    else {
        printf("Invalid position!! \n");
    }
}
void delete(int a[],int el){
    for ( i = 0; i < SIZE; i++)
    {
        if (a[i]==el){
            for (int j =i ; j<SIZE ; j++)
            {
                a[j]=a[j+1];
            }
            printf("The element %d is deleted in the postion %d \n",el,i);
            break;
        }
    }
    printlist(a);    
}
int main(){
    int a[SIZE]={15,45,46,78,75,31};
    printlist(a);
    insertat(a,66,2);
    delete(a,46);
    return 0;
}