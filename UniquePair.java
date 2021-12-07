/*
 * Problem Statement

	Write a program that takes two integers P and Q and array A as input. P determines the size of array A Your program needs to print the count of unique pairs of elements of A that have a difference of Q between them. The program will take P and Q separated by space in the first line of input and the array elements separated by space in the second line of input

	Sample Input 1

		6 4
		4 5 0 1 6 2

	Sample Output 1

		3
	Sample Input 1

		6 4
		4 5 0 8 12 9

	Sample Output 1

		 4
 */
import java.util.*;
public class UniquePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=Math.abs(arr[i] - arr[j]);
				if(sum==k) {
					count++;
				}
			}
			
		}
		System.out.print(count);

	}

}
