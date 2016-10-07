package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int i = keyboard.nextInt();
		System.out.print("Enter a  float point number: ");
		float f = keyboard.nextFloat();
		System.out.print("Enter a  you name: ");
		String name = keyboard.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %4.2e.%n", name, i, f, (i * f));

	}

}
