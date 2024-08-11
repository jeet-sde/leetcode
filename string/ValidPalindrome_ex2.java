/**
 * ValidPalindrome_ex2
 */
public class ValidPalindrome_ex2 {

    public static void main(String[] args) {
         String s ="race a car";
         System.out.println(Palindrome(s));
    }

    public static boolean Palindrome(String s){

        s=s.toLowerCase().replaceAll("[^a-z]", "");
        int i=0;
        int j=s.length()-1;

        while (i<=j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
       
    }
}