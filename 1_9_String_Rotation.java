/*
String Rotation: Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to i5Sub5tring (e.g., "waterbottle" is a rotation of"erbottlewat").
*/

package Model;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = s1 + s1;
		if(s3.isSubstring(s2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
