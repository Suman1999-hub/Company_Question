package Recursion;
import java.util.*;
public class SayDigit {
    static void sayDigit(int n,String arr[]){
        if(n==0){
            return;
        }
        int s=n%10;
        n=n/10;
        sayDigit(n,arr);
        System.out.print(arr[s]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        sayDigit(n,arr);
    }
}
