/*
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. 
*/

package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
	
	public static void main(String []args) {
		List<List<Integer>> dl = new ArrayList<List<Integer>>();
		
		Scanner input = new Scanner(System.in);
		int r =  input.nextInt();
		
		for(int i = 0; i < r; i++) {
			List<Integer> temp = new ArrayList<Integer>(); 
			for(int j = 0; j < r; j++) {
				int rr = (int) Math.round((Math.random() * 100));
				temp.add(rr);
			}
			dl.add(temp);
		}
		
		for(int i = 0; i < 3; i++) {
			int rr = (int) Math.round((Math.random() * 100));
			int row_z = rr % r;
			int rc = (int) Math.round((Math.random() * 100));
			int col_z = rc % r;
			dl.get(row_z).set(col_z, 0);
		}
		
		for(int i = 0; i < r; i++) {
			List<Integer> nl = dl.get(i);
			for(int j = 0; j < r; j++) {
				System.out.print(nl.get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
	
		Set<Integer> sr = new HashSet<Integer>();
		Set<Integer> sc = new HashSet<Integer>();
		System.out.println("Result");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < r; j++) {
				if(dl.get(i).get(j) == 0) {
					sr.add(i);
					sc.add(j);
				}
			}
		}
		System.out.println(sr);
		System.out.println(sc);
		for(Integer il : sr) {
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < r; j++) {
					if(i == il) {
						dl.get(i).set(j, 0);
					}
				}
			}
		}
		for(Integer il : sc) {
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < r; j++) {
					if(j == il) {
						dl.get(i).set(j, 0);
					}
				}
			}
		}
	
		for(int i = 0; i < r; i++) {
			List<Integer> nl = dl.get(i);
			for(int j = 0; j < r; j++) {
				System.out.print(nl.get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
