/*URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith"
*/

package Model;

import java.util.Scanner;

public class Ex2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = "";
		int l = str1.length();
		for(int i = 0; i < l; i++) {
			if(str1.charAt(i) == ' ') {
				str2 += "%20";
			} else {
				str2 += str1.charAt(i);
			}
		}
		System.out.println("Original String: " + str1);
		System.out.println("Final String: " + str2);
 	}
}
