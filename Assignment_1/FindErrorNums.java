import java.util.Arrays;
import java.util.HashSet;

public class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            if (set.contains(num)) {
                // Duplicate number found
                result[0] = num;
            } else {
                set.add(num);
                actualSum += num;
            }
        }
        
        // Calculate the missing number
        result[1] = expectedSum - actualSum + result[0];
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4,5};
        int[] result = findErrorNums(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
