public class PostfixEvaluator {
    public static int evaluate(String postfix) {
        Stack<Integer> stack = new Stack<>(postfix.length());
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if(Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else{
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a,b, token.charAt(0)));
            } // end of if else
        } // end of for

        return stack.pop();
    } // end of evaluate

    private static int applyOperator(int a, int b, char op) {
        switch(op) {
            case '+': return a + b;

            case '-': return a - b;

            case '*': return a * b;

            case '/': return a / b;

            case '^': return (int) Math.pow(a, b);

            default: throw new RuntimeException("Unrecognized operator: " + op);
        } // end of switch

    } // end of applyOperator

} // end of PostfixEvaluator
