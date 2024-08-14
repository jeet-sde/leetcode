import java.util.Stack;

/**
 * Valid_Parentheses
 */
public class Valid_Parentheses_2 {

    public boolean parentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }
        // if the stack is not empty at the end, return false
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Valid_Parentheses_2 obj = new Valid_Parentheses_2();
        String s = "()[]{}";
        System.out.println(obj.parentheses(s));
    }
}
