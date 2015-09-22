package week7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class FunctionCalls {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String>functions=new Vector<>();
		int n=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++){
			functions.add(scanner.nextLine()); //enters the functions
		}
		String formula=scanner.nextLine();
		int number=scanner.nextInt();
		
		HashMap<String,String>code=new HashMap<String,String>();
		for (int i = 0; i < functions.size(); i++) {
			String tempName;
			String tempBody;
			String tempFunction=functions.get(i);
			tempName=tempFunction.substring(0, tempFunction.indexOf(" "));
			tempBody=tempFunction.substring(tempFunction.indexOf("=")+2);
			code.put(tempName,tempBody);               //divides functions into name and body
		}
		
		String[] composition = formula.split(" \\. ");//put the composition in stack to execute functions in right order
		Stack<String> result = new Stack<>();          
		for (int i = 0; i < composition.length; i++) {
			result.push(composition[i]);
		}

		while (!result.isEmpty()) {
			number = executeFunction(number, code.get(result.peek()), code);
			result.pop();
		}
		System.out.println(number);
		
	}
	
	public static int executeFunction(int number,String body,HashMap<String,String>code){
		int result=0;
		Stack<String>sign=new Stack<>();
		Stack<String>otherStuff=new Stack<>(); //contains numbers,variables and functions' names
		sign.push("+");
		String[] tempBody = body.split(" ");
		
		for(int i=0;i<tempBody.length;i++){
			if(tempBody[i].equals("-")||tempBody[i].equals("+"))
				sign.push(tempBody[i]);
			else
				otherStuff.push(tempBody[i]);
			}
		
		while (!otherStuff.isEmpty()) {
			String element=otherStuff.peek();
			if (sign.pop().equals("+")) {
				if (element.matches("\\d+"))
					result = result + Integer.parseInt(element);
				else if (code.containsKey(element)){
						result = result
							+ executeFunction(number,code.get(element), code);
				}
				else
					result = result + number;
				otherStuff.pop();
			} else {
				if (otherStuff.peek().matches("\\d+"))
					result = result - Integer.parseInt(otherStuff.peek());
				else if (code.containsKey(otherStuff.peek()))
					result = result
							- executeFunction(number,code.get(otherStuff.peek()), code);
				else
					result = result - number;
				otherStuff.pop();
			}
			
		}
	
		return result;
	}

	
}
