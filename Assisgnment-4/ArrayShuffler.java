import java.util.Arrays;

class ArrayShuffler {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j = 0, k = n;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[j];
                j++;
            } else {
                result[i] = nums[k];
                k++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] result = shuffle(nums, n);
        
        System.out.println("Output: " + Arrays.toString(result));
    }
}
