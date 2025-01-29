import java.util.*;
public class swapfirstlast {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            int first=n;
            int d=(int)Math.log10(n)+1;
            while(first>10){
                first/=10;
            }
            System.out.print(first+" ");
            int l;
            l=n%10;
            System.out.print(l+" ");

            int middle=n%(int)Math.pow(10,d-1);
            middle/=10;
            
            System.out.print(middle+" ");
            int swap=l*(int)Math.pow(10,d-1)+(middle*10)+first;
            System.out.println(swap);






        }

    }

}
