import java.util.*;
public class prac4{
    public static void main(String [] args){
        int arr[] = {1,6,3,4,5};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum ="+ sum);
        int largest=0;
        for (int i = 0; i<arr.length;i++){
            if (arr[largest]<arr[i]){
                largest=i;
            }
        }
        System.out.println("The largest element is :"+ arr[largest]);        
    }
}