/*
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
*/

package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String []args) {
		List<List<Integer>> dl = new ArrayList<List<Integer>>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Scanner input = new Scanner(System.in);
		int r =  input.nextInt();
		
		for(int i = 0; i < r; i++) {
			List<Integer> temp = new ArrayList<Integer>(); 
			List<Integer> temp1 = new ArrayList<Integer>();
			for(int j = 0; j < r; j++) {
				int rr = (int) Math.round((Math.random() * 100));
				temp.add(rr);
				temp1.add(0);
			}
			dl.add(temp);
			res.add(temp1);
		}
		
		for(int i = 0; i < r; i++) {
			List<Integer> nl = dl.get(i);
			for(int j = 0; j < r; j++) {
				System.out.print(nl.get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
	
		for(int i = 0; i < r; i++) {
			List<Integer> nl = dl.get(i);
			for(int j = 0; j < r; j++) {
				List<Integer> res_nl = res.get(j);
				res_nl.set(r - i - 1, nl.get(j));
			}
		}
		System.out.println("Result");
		for(int i = 0; i < r; i++) {
			List<Integer> nl = res.get(i);
			for(int j = 0; j < r; j++) {
				System.out.print(nl.get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
