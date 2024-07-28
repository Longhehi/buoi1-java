import java.util.Scanner;

public class ArrayTransformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            int left = (i > 0) ? A[i - 1] : 0;
            int right = (i < n - 1) ? A[i + 1] : 0;
            B[i] = A[i] + (left + right) / 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(B[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
