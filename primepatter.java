
import java.util.Scanner;

public class primepatter {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            int n=scan.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(isprime(i)){
                        System.out.print("*");
                    }
                
            }
                System.out.println();

            }
        }

            
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
              if(n%i==0){
                return false;
              }
        
        }
        return true;


    }
}
