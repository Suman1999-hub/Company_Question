/*
Input:
  Suman
Output:
  False
Input:
  Suman123
Output:
  True
*/
import java.util.*;
public class Main
{
    static boolean isalnum(String s){
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                flag++;
            }
        }
        if(flag>0){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    if(isalnum(str)==true){
	        System.out.print("True");
	    }
	    else{
	        System.out.print("False");
	    }
	    
	}
}
