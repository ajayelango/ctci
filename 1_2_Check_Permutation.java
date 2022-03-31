//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other

package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		int l1 = str1.length();
		int l2 = str2.length();
		
		if(l1 != l2) {
			System.out.println("One string is not a permutation of the other");
			System.exit(0);
		}
		
		for(int i = 0; i < l1; i++) {
			if(hm.containsKey(str1.charAt(i))) {
				int a = hm.get(str1.charAt(i));
				hm.put(str1.charAt(i), ++a);
			} else {
				hm.put(str1.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < l2; i++) {
			if(hm.containsKey(str2.charAt(i))) {
				int a = hm.get(str2.charAt(i));
				hm.put(str2.charAt(i), --a);
			} else {
				System.out.println("One string is not a permutation of the other");
				break;
			}
		}
		boolean res = false;
		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
			if(e.getValue() != 0) {
				System.out.println("One string is not a permutation of the other");
				res = true;
				break;
			}	
		}
		if(!res) {
			System.out.println("One string is a permutation of the other");
		}
		
	}
}
