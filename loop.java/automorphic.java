import java.util.*;
public class automorphic {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            int s=n*n;
            if(is(n, s)){
                System.out.print("Automorphic number.");
            }else{
                System.out.print("Not an automorphic.");
            }
        }
    }
        public static boolean is(int n,int s){
            while(n>0){
                if(n%10!=s%10){
                    return false;
                }
                n/=10;
                s/=10;
            }
            return true;
        }
    
}
