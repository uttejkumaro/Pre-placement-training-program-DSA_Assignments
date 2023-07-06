import java.util.Arrays;

class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        
        ArrayPairSum solution = new ArrayPairSum();
        int result = solution.arrayPairSum(nums);
        
        System.out.println("Output: " + result);
    }
}
