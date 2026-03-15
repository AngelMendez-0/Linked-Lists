import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an infix expression: ");
        String infix = input.nextLine();

        try{
            String postfix = InfixToPostfix.convert(infix);
            int result = PostfixEvaluator.evaluate(postfix);

            System.out.println("The postfix is: " + postfix);
            System.out.println("The final result is: " + result);
        } catch(Exception e){
            System.out.println(e.getMessage());
        } // end of try catch

        input.close();
    } // end of main

} // end of tester
