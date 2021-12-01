// Find the nth term of the series.
//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
import java.util.*;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		int b=1;
		int sum=n-2;
		System.out.print(a+" "+b+" ");
		if(sum%2==0) {
			while(sum>1) {
				a=a*2;
				b=b*3;
				System.out.print(a+" ");
				System.out.print(b+" ");
				sum=sum-2;
			}
		}
		else {
			while(sum>1) {
				a=a*2;
				b=b*3;
				System.out.print(a+" ");
				System.out.print(b+" ");
				sum=sum-2;
			}
			System.out.print(a*2+" ");
		}
		

	}

}
