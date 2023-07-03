import java.util.HashSet;
import java.util.Set;

public class MaxiCandies {
    public static int maxCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        int maxAllowed = candyType.length / 2;
        
        for (int candy : candyType) {
            uniqueCandies.add(candy);
            
            // If we have already reached the maximum number of unique candies allowed, we can return early.
            if (uniqueCandies.size() == maxAllowed) {
                return maxAllowed;
            }
        }
        
        // If the number of unique candies is less than the maximum allowed, return the number of unique candies.
        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println(maxCandies(candyType));
    }
}
