#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int main(){
    printf("Linear search");
    int a[MAX],b,c,key,i,n;
    do
    {
        printf("\n Enter the number of elements :");
        scanf("%d",&n);
        if (n>= MAX){
            printf("THE MAXIMUM SIZE IS %d",MAX);
            break;
        }
        for (i=0;i<n;i++){
            printf("\n Enter the element %d : ",i);
            scanf("%d",&b);
            a[i]=b;
        }
        printf("\n The elements stored in the array are :");
        for (i=0;i<n;i++){
            printf(" %d",a[i]);
        }
        printf("\n Enter the element to be searched :");
        scanf("%d",&key);
        for (i=0;i<n;i++){
            if (a[i]==key)
            {
                printf("\n The element is found at positon %d ",i);
                break;
            }
            else if(i==n-1 && a[i]!= key){
                 printf("\n The element is not found at any positon");
            }
        }
        printf("\n Do you want to continue again?");
        printf("\n If yes input 1 : ");
        scanf("%d",&c);
    } while (c==1);
    
    return 0;
}