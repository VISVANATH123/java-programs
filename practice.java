import java.util.*;
public class practice {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            int first=n;
            while(first>10){
                first/=10;
            }
            int d=(int)Math.log10(n)+1;
            int l=n%10;
            int middle=n%(int)Math.pow(10,d-1);
            middle/=10;
            int swap=l*(int)Math.pow(10,d-1)+(middle*10)+first;
            System.out.print(swap);

        }
    }
}
