package StringQuestions;

public class LongestPalindromeInaString {

	public static void main(String[] args) {
		String str = "aaaabbaa";
		solution(str);
/*Neeedss modification.........................
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	}

	public static void solution(String str) {
		int counter=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j =str.length()-1; j>=0; j--) {
				String sub=str.substring(i);
				

				boolean res = Ispalindrome(sub);

				if (res) {
					System.out.println(sub);
					counter++;
					break;
				}
			}
		}
		if(counter==0){
			System.out.println(str.charAt(0));
		}
	}

	public static boolean Ispalindrome(String str) {
		int i = 0;
		int j=str.length()-1;
		
		if(str.length()==1){
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

}
