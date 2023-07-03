import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First unique character in \"" + s1 + "\": " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First unique character in \"" + s2 + "\": " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First unique character in \"" + s3 + "\": " + firstUniqChar(s3));
    }
}
