import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();

        // Compute area using the correct formula
        if (shape.equals("circle")) {
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("Area: %.2f\n", area);
        }
        else if (shape.equals("rectangle")) {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            double area = l * w;
            System.out.printf("Area: %.2f\n", area);
        }
        else if (shape.equals("triangle")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area: %.2f\n", area);
        }
        
        sc.close();
    }
}
