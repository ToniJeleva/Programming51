package week7;

import java.util.Scanner;
import java.util.Stack;

public class StringUtils {
	public static String reverseStringWithStack(String s) {
		String result="";
		Stack<Character> temp=new Stack<>();
		for(int i=0;i<s.length();i++){
			temp.push(s.charAt(i));
			}
		while(!temp.isEmpty()){
			result=result+temp.pop();
		}
	    return result;
	  }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println(reverseStringWithStack(s));

	}

}
