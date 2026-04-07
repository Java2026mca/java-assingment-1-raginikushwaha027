import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        if (n > 0) {
            System.out.print("0");
        }
        if (n > 1) {
            System.out.print(" 1");
        }
        
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
        System.out.println();
        sc.close();
    }
}
