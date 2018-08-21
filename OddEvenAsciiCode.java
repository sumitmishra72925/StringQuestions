/* Take as input S, a string. Write a function that replaces every odd character with the character 
 * having just higher ascii code and every even character with the character having just lower ascii code. 
 * Print the value returned. 
 * 
 * Input
 * 
 * ABCdeF
 * 
 * Output
 * 
 *  A>64
	B>67
	C>66
	d>101
	e>100
	F>71*/
package StringQuestions;


public class OddEvenAsciiCode {

	public static void main(String[] args) {
		String str = "ABCdeF";
		Solution(str);

	}

	public static void Solution(String str) {
		int res;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				res = (int) (ch - 1);
				
				System.out.print(ch+">" +res);
				System.out.println();
			} else {
				res = (int) (ch + 1);
				System.out.print(ch+ ">" +res);
				System.out.println();
			}
		}
	}

}
