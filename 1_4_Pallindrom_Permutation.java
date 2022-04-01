/* 
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atco eta·; etc.)

*/

package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		int l1 = str1.length();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < l1; i++) {
			if(hm.containsKey(str1.charAt(i))) {
				int c = hm.get(str1.charAt(i));
				hm.put(str1.charAt(i), c + 1);
			} else if(str1.charAt(i) != ' ') {
				hm.put(str1.charAt(i), 1);
			}
		}
		boolean res = true;
		int count1s = 0;
		for(Map.Entry<Character, Integer> hme : hm.entrySet()) {
			int val = hme.getValue();
			if(count1s > 1 && (val % 2 != 0)) {
				res = false;
				++count1s;
				break;
			} else if(val % 2 != 0) {
				++count1s;
			}
			
		}
		if(res && count1s < 2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
  	}
}
