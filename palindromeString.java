package StringQuestions;

import java.util.Scanner;

public class palindromeString {
	/*Take as input S, a string. Write a function that returns true if the string 
	 is a palindrome and false otherwise. Print the value returned
	 
	 Input
	 abbba
	 
	 output
	  true */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string :");
		String str = scn.nextLine();
		int n = str.length()-1;
		System.out.println(n);
		boolean res = Solution(str, n);
		System.out.println(res);

	}

	public static boolean Solution(String str, int n) {
		int i=0;
		int j=n;
		while(i<n && j>=0){
			if(str.charAt(i)==str.charAt(j)){
				i++;
				j--;
			}else
				return false;
		}
		return true;

	}

}
