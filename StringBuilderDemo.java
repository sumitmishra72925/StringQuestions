package StringQuestions;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder("Hello"); 
		
		System.out.println(sb.length());	
		System.out.println(sb.charAt(2));

		sb.setCharAt(2, 't');
		System.out.println(sb);
		
		sb.append('e');
		System.out.println(sb);

		sb.insert(3, 'f');
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		System.out.println(sb.toString());

	}

}
