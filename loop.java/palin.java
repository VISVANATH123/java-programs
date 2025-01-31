import java.util.*;
public class palin{
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            int o=n;
            int rev=0;
            while(n>0){
                int rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }
            if(rev==o){
                System.out.print("Palindrome");
            }
            else{
                System.out.print("Not palindrome");
            }
        }
    }
}