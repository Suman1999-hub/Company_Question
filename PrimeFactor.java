//Prime Factor
/*
    Input:
        315
    Output:
        3 3 5 7
*/
package Array;
import java.util.*;
public class PrimeFactor {
    static void primeFact(int n){
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeFact(n);
    }
}
