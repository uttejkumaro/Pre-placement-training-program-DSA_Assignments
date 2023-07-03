public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        // Create a counting array to store the frequency of each number
        int[] count = new int[2001]; // Range: -1000 to 1000
        for (int num : nums) {
            count[num + 1000]++;   //time complexity=O(N) 
                                   //space  complexity=O(1)
        }
        
        int sum = 0;
        boolean oddCount = true; // Flag to alternate pairing
        
        // Iterate through the counting array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (oddCount) {
                    // Add the number to the sum
                    sum += i - 1000;
                }
                oddCount = !oddCount;
                count[i]--;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println("Maximum Sum: " + maxSum);
    }
}
