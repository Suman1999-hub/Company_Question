import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double sum=0.0;
		sum=(100+r)/100;
		double x=0.0;
		long t=1;
		while(x<=1000000) {
			x=p*Math.pow(sum, t);
			if(x>=1000000) {
				break;
			}
			t++;
		}
		System.out.print(t);


	}

}
