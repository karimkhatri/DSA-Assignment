import java.util.Stack;

public class ParenthesesMatcher {

    public static void main(String[] args) {
        String expression1 = "({[}])"; // Invalid
        String expression2 = "({[]})";  // Valid
        String expression3 = "((()))";  // Valid
        String expression4 = ")(}{";    // Invalid

        System.out.println(expression1 + ": " + isParenthesesMatched(expression1));
        System.out.println(expression2 + ": " + isParenthesesMatched(expression2));
        System.out.println(expression3 + ": " + isParenthesesMatched(expression3));
        System.out.println(expression4 + ": " + isParenthesesMatched(expression4));
    }

    public static boolean isParenthesesMatched(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched parentheses
                }
            }
        }

        return stack.isEmpty(); // True if all parentheses are matched
    }
}
