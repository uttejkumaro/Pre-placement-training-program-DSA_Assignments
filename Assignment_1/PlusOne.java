import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, simply increment it
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and propagate the carry-over
                digits[i] = 0;
            }
        }

        // If there is a carry-over after iterating through all digits, create a new array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
