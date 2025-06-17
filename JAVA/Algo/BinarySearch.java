import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] arr, int target){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid = (l+h) /2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid]<target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,24,654,234,233,12,5};
        int target = 12;
        Arrays.sort(arr);
        System.out.println("Sorted arr = "+ Arrays.toString(arr));
        int res = search(arr, target);
        if (res == -1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element found at index "+res);
        }
    }
}
