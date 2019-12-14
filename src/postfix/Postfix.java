package postfix;

import java.util.Stack;

public class Postfix {

    private static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
//        String input = "ABC/-AK/L-*";
        String input = "3x2^*y*4x*y2^*2x*3y*+12/^/+";

        System.out.println("Postfix : " + input);
        System.out.println("Infix   : " + postfixInfix(input));
        System.out.println("Prefix  : " + postfixPrefix(input));

    }

    private static String postfixInfix(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (operator(c)) {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "(" + s2 + c + s1 + ")";
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    private static String postfixPrefix(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (operator(c)) {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = c + s2 + s1;
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    private static boolean operator(char c) {
        switch (c) {
            case '-':
            case '+':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }


}
