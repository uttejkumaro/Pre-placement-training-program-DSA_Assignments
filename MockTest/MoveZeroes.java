import java.util.Arrays;
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; 
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }        }

           while (count < n) {
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println("Output 1: " + Arrays.toString(nums1));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println("Output 2: " + Arrays.toString(nums2));
    }
}
