
// 💡 Question 6
// Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

// Example 1:
// Input: nums = [-4,-1,0,3,10]

import java.util.Arrays;

class SortedSquaresSolution {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        
        int[] result = sortedSquares(nums);
        
        System.out.println("Output: " + Arrays.toString(result));
    }
}
