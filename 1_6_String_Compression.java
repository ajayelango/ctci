/*

String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

*/
package Model;

import java.util.Scanner;

public class Ex2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = "";
		int l = str1.length();
		Integer j = 0;
		for(int i = 0; i < l; i = i + j) {
			char c = str1.charAt(i);
			j = 0;
			while(((i + j) < l) && str1.charAt(i + j) == str1.charAt(i)) {
				j++;
				//System.out.println("i: " + i + ", j: " + j);
			}
			str2 += c;
			str2 += j.toString();
		}
		int l2 = str2.length();
		if (l2 < l) {
			System.out.println(str2);
		} else {
			System.out.println(str1);
		}
	}
}
