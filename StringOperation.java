package StringQuestions;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		// substring , + , concat , nextLine , new String makes a new string in
				// heap, outside intern pool

				// String s1 = "Hello";
				// String s2 = "World";
				// String s3 = "Hello";
				// String s5 = "ByeWorld";
				//
				// String s4 = new String("Bye"); // new String outside intern pool
				// s4 = s4 + "World"; // new String outside intern pool
				// String s5 = "hibye"; // inside intern pool
				// String s6 = scn.nextLine(); // new String outside intern pool

				String str = "Hello";

				// Part-1 : Length of String
				System.out.println(str.length());

				// Part-2 : CharAt Limit:0->length-1
				System.out.println(str.charAt(0));
				// System.out.println(str.charAt(str.length()));
				System.out.println(str.charAt(str.length() - 1));

				// Part-3 : Substring Limit:0->length
				System.out.println(str.substring(2, 4)); // ll
				System.out.println(str.substring(2, 3)); // l
				System.out.println(str.substring(2, 2)); // khaali
//				 System.out.println(str.substring(2, 1)); // error
				System.out.println(str.substring(2, 5)); // llo
				// System.out.println(str.substring(2, 6)); // error
				System.out.println(str.substring(2)); // llo

				Scanner scn = new Scanner(System.in);

				// Part-4 : Concatenate Two Strings
				String s1 = "hi";
				String s2 = "bye";
				String s3 = s1 + s2;
				System.out.println(s1 + ", " + s2 + ", " + s3);
				String s4 = s1.concat(s2);
				System.out.println(s1 + ", " + s2 + ", " + s4);

				// Part-5 : IndexOf
				System.out.println(str.indexOf("e"));
				System.out.println(str.indexOf("eL"));

				// Part-6 : StartsWith
				System.out.println(str.startsWith("He"));
				System.out.println(str.startsWith("he"));

				// Part-7 : Equals and ==
				s1 = "Hello";
				s2 = s1;
				s3 = "Hello";
				s4 = new String("Hello");

				System.out.println((s1 == s2) + ", " + s1.equals(s2)); // true true
				System.out.println((s1 == s3) + ", " + s1.equals(s3)); // true true
				System.out.println((s1 == s4) + ", " + s1.equals(s4)); // false true

				str = str.replace("ll", "wwww");
				System.out.println(str);
				appendString();
			}

			public static void appendString() {
				long start = System.currentTimeMillis();

				int n = 10;
				// String s = "";
				StringBuilder sb = new StringBuilder();
				// int s = 0;

				for (int i = 0; i <n; i++) {
					// s = s + i;
					sb.append(i);
					System.out.print(" "+sb);
				}
				
				long end = System.currentTimeMillis();
				System.out.println(end - start);

			}

	}


