package loopjava;
import java.util.*;
public class primecount {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            int count=0,num=1;
            while(count<n){
                num++;
                if(is(num)){
                    count++;
                }
            }
            System.out.print(num);


        }

    }
    public static boolean is(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}
