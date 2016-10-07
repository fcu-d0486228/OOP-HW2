package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string 1: ");
		String s1 = keyboard.next();
		System.out.print("Enter a string 2: ");
		String s2 = keyboard.next();
		float a = s1.compareToIgnoreCase(s2);
		if(a == 0){
			System.out.println("The two strings are the same.");
		}
		else{
			System.out.println("The two strings are not the same.");
		}
	}

}
