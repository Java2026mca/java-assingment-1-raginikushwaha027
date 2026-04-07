import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // Fill matrix in spiral order
        while (top <= bottom && left <= right) {
            // left → right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
            diagonalSum += matrix[i][i]; // primary diagonal
        }

        System.out.println("Diagonal: " + diagonalSum);
    }
}
