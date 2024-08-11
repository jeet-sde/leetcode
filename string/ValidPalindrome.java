public class ValidPalindrome {
    
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
