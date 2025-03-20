package TUGAS5;

import java.util.Stack;

public class Main1 {
    public static boolean isbalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (kurungBuka(c)) {
                stack.push(c);
            } else if (kurungTutup(c)) {
                if (stack.isEmpty() || !checker(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    private static boolean kurungBuka(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean kurungTutup(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean checker(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String[] testCases = {"[({})]", "[]{}()", "[{)]", "[{"};

        for (String test : testCases) {
            System.out.println(test + " -> " + (isbalanced(test) ? "Cocok" : "Nggak cocok"));
        }
    }
}
