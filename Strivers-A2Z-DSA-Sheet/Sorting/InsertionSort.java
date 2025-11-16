import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {12,34,123,3,32,56,69};
        System.out.println("Before starting: "+ Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
    private static void sort(int[] nums){
        int n = nums.length;
        for (int i=0;i<n;i++){
            int j = i;
            while (j>0 && nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }
    
}
