package qr.program.leetcode;

import java.util.Stack;

/**
 * @author qr
 * @date 2022/3/31 20:52
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid2("()"));
    }

    public boolean isValid2(String s) {
        int length = 0;
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }while (length != s.length());
        return s.length() == 0;
    }

    public boolean isValid(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (isLeft(c)) {
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character left = stack.pop();
                if (!isPair(c, left)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(char right, char left) {
        return switch (right) {
            case ')' -> left == '(';
            case ']' -> left == '[';
            case '}' -> left == '{';
            default -> false;
        };
    }

    private boolean isLeft(char c) {
        return c == '{' || c == '[' || c == '(';
    }
}
