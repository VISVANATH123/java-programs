package loopjava;
import java.util.Scanner;

public class harmoni {
    public static void main(String args){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            double sum=0;
            for(int i=1;i<=n;i++){
                double a=1.0/i;
                sum+=a;
            }
        }
    }
}
