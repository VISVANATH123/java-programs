import java.util.*;
public class palintriangle {
    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt(),i,j;
            for(i=1;i<=n;i++){
                
                for(j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
               for(j=i-1;j>=i;j--){
                System.out.print(j+" ");
                }
                System.out.println();
            }

        }
    }
}
