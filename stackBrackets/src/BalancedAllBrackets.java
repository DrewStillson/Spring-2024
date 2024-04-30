import java.util.Stack;
public class BalancedAllBrackets {
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<>();
        int closedCount = 0;
        int openedCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                openedCount++;
            }
            else {
                if (!stack.empty()) {
                    stack.pop();
                }
                closedCount++;
            }
        }
        if (openedCount == closedCount) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
