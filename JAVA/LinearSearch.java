public class LinearSearch{
    public static int search(int [] arr, int target){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {1,24,654,234,233,12,5};
        int target = 13;
        int res = search(arr, target);
        if (res == -1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element found at index "+res);
        }
    }
}