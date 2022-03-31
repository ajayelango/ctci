//Implement an algorithm to determine if a string has all unique characters.

package Model;

import java.util.HashSet;
import java.util.Scanner;

public class Ex2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		HashSet<Character> m = new HashSet<>();
		int length = str.length();
		boolean res = true;
		for(int i = 0; i < length; i++) {
			if(m.contains(str.charAt(i))) {
				System.out.println("The string is not unique");
				res = false;
			} else {
				m.add(str.charAt(i));
			}
		}
		if (res) {
			System.out.println("The string is unique");
		}
	}
}


