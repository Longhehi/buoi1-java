import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        double pi = 3.14;
        double circumference = 2 * pi * r;
        double area = pi * r * r;
        System.out.printf("%.3f %.3f", circumference, area);
    }
}
