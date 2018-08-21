package StringQuestions;

public class ToggleCaseOfCharacter {
/*Take as input S, a string. Write a function that toggles the case 
of all characters in the string. Print the value returned.
	 
input
	 
sUMIT
	  
Output
	  
Sumit*/
	

	public static void main(String[] args) {
		String str = "sUMIT";
		Solution(str);

	}

	public static void Solution(String str) {
		char result;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				
				result = (char) (ch + 32);
				System.out.print(result);

			} else if (ch >= 'a' && ch <= 'z') {
				result = (char) (ch - 32);
				System.out.print(result);
			}

		}
	}

}
