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
		if(Math.abs(l1 - l2) > 1) {
			System.out.println("False");
			return;
		}
		
		for(int i = 0; i < l1; i++) {
			if(hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), hm.get(str1.charAt(i)) + 1);
			} else {
				hm.put(str1.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < l2; i++) {
			if(hm.containsKey(str2.charAt(i))) {
				hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1);
			} else {
				hm.put(str2.charAt(i), 1);
			}
		}
		int s = 0;
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			s += Math.abs(m.getValue());
		}
		if(s <= 2) {
			System.out.println("True"); 
		} else {
			System.out.println("False");
		}
	}
}
