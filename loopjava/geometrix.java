package loopjava;
import java.util.*;
public class geometrix{
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int a=scan.nextInt();
            float b=1,sum=0;
            for(int i=1;i<=a;i++){
                double n=1.0/b;
                sum+=n;
                b*=2;
            }
            System.out.printf("%.2f",sum);
        }
    }
}