package StringQuestions;

import java.util.Scanner;
/*Any string is said to be a good string if its palindrome and every character should be vowel we need to return the size of that 
 * good string
 * eg=aaa is a good string beacuse it consist only vowel and it is  palindrome too
 * 
 * input
 * 
 *  abcaaaba
 *  
 *  output
 *  
 *  Yes, 3*/

public class Good_string {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter an string");
		String str = s.next();

		solution(str);

	}

	public static void solution(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {

			{
				for (int j = i + 1; j <= str.length(); j++) {
					{
						String check = str.substring(i, j);
						boolean res = Ispalindrome(check);
						if (res) {
							boolean check2 = good(check);
							if (check2) {
								System.out.println(check.length());
							}
						}
					}

				}
			}
		}
	}

	public static boolean Ispalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		if (str.length() == 1) {
			return false;
		}
		while (i < str.length() && j >= 0) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}

		return true;
	}
	public static boolean good(String str){
		int i=0;
		while(i<str.length()){
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				i++;
				
			}else{
				return false;
			}
		}
		return true;
		
	}

}
