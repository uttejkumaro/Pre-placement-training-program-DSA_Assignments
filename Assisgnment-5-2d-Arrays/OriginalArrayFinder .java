import java.util.Arrays;

class OriginalArrayFinder {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if ((n & 1) == 1) return new int[]{};
        
        int[] ans = new int[n / 2];
        int idx = 0;
        int[] freq = new int[(int) (1e5 + 5)];
        
        for (int num : changed) freq[num]++;
        
        for (int num = (int) (1e5); num >= 0; num--) {
            while (freq[num]-- > 0) {
                if ((num & 1) == 1) return new int[]{};
                int div = num / 2;
                if (freq[div] == 0) return new int[]{};
                ans[idx++] = div;
                freq[div]--;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println("Original array: " + Arrays.toString(original));
    }
}
