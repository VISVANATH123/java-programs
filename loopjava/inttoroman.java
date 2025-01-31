package loopjava;
import java.util.Scanner;

public class inttoroman {
    public static void main(String[] args) {
	    try(Scanner scan=new Scanner(System.in)){
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder r=new StringBuilder();
        int n=scan.nextInt();
        for(int i=0;i<values.length;i++){
            while(n>=values[i]){
                r.append(symbols[i]);
                n-=values[i];
            }
        }
      System.out.print(r.toString());
    }
    }
    
}
