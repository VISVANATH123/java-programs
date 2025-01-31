package loopjava;
import java.util.*;
public class digitsummation {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
             int n=scan.nextInt();
             int sum=(di(n));
             System.out.print(sum);

        }
       
    }
    public static int di(int n){
        return 1+(n-1)%9;
    }
   
}
