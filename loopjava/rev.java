package loopjava;
import java.util.*;
public class rev {
    public static void main(String args[]){
        try(Scanner scan =new Scanner(System.in)){
            int n=scan.nextInt();
            while(n>0){
                int rem=n%10;
                System.out.print(rem);
                n/=10;
            }

        }
    }
}
