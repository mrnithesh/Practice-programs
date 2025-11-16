import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {5,2,9,1,5,6};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
    private static void sort(int[] nums) {
        int n = nums.length;
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
