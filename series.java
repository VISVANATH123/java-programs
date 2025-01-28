import java.util.*;
public class series {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            if(i!=n){
                System.out.print("+ ");
            }
            a=a*10+3;
           
        }

    }
    }

