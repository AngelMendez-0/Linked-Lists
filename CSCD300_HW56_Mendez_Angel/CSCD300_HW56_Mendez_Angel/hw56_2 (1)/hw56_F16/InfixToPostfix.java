public class InfixToPostfix {
    public static String convert(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>(infix.length());

        for (char ch : infix.toCharArray()) {

            if (Character.isDigit(ch)) {
                postfix.append(ch).append(' ');

            } else if (ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                } // end of while

                stack.pop(); // pop '('

            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop()).append(' ');
                } // end of while

                stack.push(ch);
            } // end of if else

        } // end of for

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        } // end of while

        return postfix.toString().trim();
    } // end of convert

    private static boolean isOperator(char c) {
        return "+-*/^".indexOf(c) != -1;

    } // end of isOperator

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return 0;
        } // end of switch
    } // end of precedence

} // end of Infix to postfix

