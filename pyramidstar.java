import java.util.*;
public class pyramidstar {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            for(int i=n-1;i>=0;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
