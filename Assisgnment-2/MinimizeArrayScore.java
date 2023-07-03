public class MinimizeArrayScore {
    public static int minimizeScore(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        if (max - min <= 2 * k) {
            return 0;
        }
        
        return max - min - 2 * k;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        System.out.println(minimizeScore(nums, k));
    }
}
