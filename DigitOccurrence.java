/*
 * Question
 * 
	Write an algorithm to find the number of occurrences of needle in a given positive number haystack
	
	Input
	
		The first line of the input consists of an integer needle, representing a digit.
		
		The second line consists of an integer haystack, representing the positive number.
	
	Output
	
		Print an integer representing the number of occurrences of needle in haystack
	
	Example 
	Input:
			2
			123228
	
	Output:
			3
 */
import java.util.*;
public class DigitOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int st=sc.nextInt();
		
		int count=0;
		while(st!=0) {
			int temp=st%10;
			if(temp==n) {
				count++;
			}
			st=st/10;
		}
		System.out.print(count);
	}

}
