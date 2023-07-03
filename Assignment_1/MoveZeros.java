import java.util.Arrays;
public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0; 
        int j = 0;        
        while (j < nums.length) {
           
            if (nums[j] != 0) {              
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1,0, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
