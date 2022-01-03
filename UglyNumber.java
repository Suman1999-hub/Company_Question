package Array;
import java.util.*;
public class UglyNumber {
    static void isUglyNumber(int n){
        int p=n;
        boolean flag=true;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
                System.out.print("False");
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.print("True");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isUglyNumber(n);
    }
}
