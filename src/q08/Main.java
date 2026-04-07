import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        
        // Stack implementation using array
        int[] stack = new int[1000]; 
        int top = -1; 
        
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            
            if (operation.equals("PUSH")) {
                int x = sc.nextInt();
                stack[++top] = x; 
            }
            else if (operation.equals("POP")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                    top--; 
                }
            }
            else if (operation.equals("PEEK")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                }
            }
            else if (operation.equals("SIZE")) {
                System.out.println(top + 1); 
            }
            
            sc.nextLine(); 
        }
        
        sc.close();
    }
}
