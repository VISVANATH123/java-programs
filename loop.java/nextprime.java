
import java.util.*;
public class nextprime
{
	public static void main(String[] args) {
		int count=0;
		try(Scanner scan = new Scanner (System.in)){
		int n=scan.nextInt();
		while(count<5){
		    n++;
		    if(is(n)){
		        System.out.print(n+" ");
		        count++;
		    }
		    
		}
	}
	}
	public static boolean is(int n){
	    if (n <=1) return false;
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if (n %i == 0){
	            return false;
	        }
	    }
	    return true;
	}
}