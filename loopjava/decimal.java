package loopjava;
import java.util.*;
public class decimal {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int base=1;
            int n=scan.nextInt();
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*base;
                base*=2;
                n/=10;
            }
            System.out.print(sum);

        }
    }
}
