import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read entire line of postfix expression
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        
        // Use stack to evaluate postfix expression
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {
                // Operator: pop two operands, apply operation, push result
                int b = stack.pop();
                int a = stack.pop();
                
                int result;
                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break; // integer division
                    default: continue;
                }
                
                stack.push(result);
            } else {
                // Operand: push to stack
                stack.push(Integer.parseInt(token));
            }
        }
        
        // Final result is on top of stack
        System.out.println(stack.pop());
        
        sc.close();
    }
}
