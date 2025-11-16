import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        int [] nums = {2,333,542,32,12,32,9};
        System.out.println("Before sorting: "+Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
    }
    private static void sort(int[] nums){
        int n = nums.length;
        for (int i=0;i<n;i++){
            int minIndex = i;

            for (int j=i;j<n;j++){
                if (nums[j]<nums[minIndex]){
                    minIndex =j;
                }
            }
            //swap
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}