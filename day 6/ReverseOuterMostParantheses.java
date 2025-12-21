import java.util.Stack;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
public class ReverseOuterMostParantheses {
    public String reverseOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    current.append(ch);
                }
                depth++;
            } else if (ch == ')') {
                depth--;
                if (depth > 0) {
                    current.append(ch);
                } else {
                    result.append(current.reverse());
                    current.setLength(0); // Clear the current StringBuilder
                }
            }
        }

        return result.toString();
    }
    
}
