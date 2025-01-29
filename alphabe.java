import java.util.*;

public class alphabe {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int a = 65;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) a + " ");
                }
                a++;
                System.out.println();
            }
        }
    }
}
