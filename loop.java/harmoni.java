import java.util.Scanner;

public class harmoni {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scan.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                double a = 1.0 / i;
                sum += a;
            }
            System.out.println("Harmonic sum: " + sum);
        }
    }
}