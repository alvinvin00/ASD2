package exp_tree;

import java.util.Stack;

public class InfixPostfix {

    public static void main(String[] args) {
        InfixPostfix ip = new InfixPostfix();
//        String exp = "(((1/3)*(x^2))+(4*(y^3))-z)/((x*y)^(1/2))";
        String exp = "((3*(x^2)*y))+(4*x*(y^2))/(((2*x)+(3*y))^(1/2))";


        System.out.println(ip.infixToPostfix(exp));
    }

    public String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        char c;
        for (int i = 0; i < exp.length(); ++i) {
            c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                output.append(c);
            }else if(c == '('){
                stack.push(c);
            }else if( c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    output.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return "Invalid Expression";
                }else{
                    stack.pop();
                }
            }else{
                while(!stack.isEmpty() && levelOperator(c) <= levelOperator(stack.peek())){
                    if(stack.peek() == '('){
                        return "Invalid";
                    }
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid";
            }
            output.append(stack.pop());
        }
        return output.toString();
    }


    public int levelOperator(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }
}
