package StringQuestions;

public class PalindromicSubstring {
	/*Take as input S, a string. Write a function that returns the count of substrings of 
	 this string which are palindromes. Print the value returned.
	 
	 Input
	 nitin
	 
	 output 
	  15(As 15 Palnidromic subString are present in the word "Nitin")
	  */

	public static void main(String[] args) {
		String str = "nitin";
		int n = str.length();

		int res = palidromicsubstring(str, n);
		System.out.println(res);

	}

	public static boolean Ispalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while (i < str.length() && j >= 0) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else
				return false;

		}
		return true;
	}

	public static int palidromicsubstring(String str, int n) {
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String val =str.substring(i, j);
				if(Ispalindrome(val))
					System.out.println(val);
					counter++;
			}
		}
		return counter;
	}

}
