import java.util.HashSet;
import java.util.Set;

class LongestSubstring {

    public static int solve(String str) {
        if (str.length() == 0) return 0;

        int maxAns = 0; // Changed from Integer.MIN_VALUE to 0 to handle empty strings properly
        
        for (int i = 0; i < str.length(); i++) {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < str.length(); j++) { // corrected the loop from j=1 to j=i
                if (se.contains(str.charAt(j))) {
                    maxAns = Math.max(maxAns, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
           
        }
        return maxAns;
    }

    public static void main(String[] args) {
        String str = "jeetjadav";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
}
