class MinimumFinder {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,1,5,2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
