package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int integer = keyboard.nextInt();
		System.out.print("The input integer is ");
		if(integer % 2 == 1){
			System.out.println("Odd Number.");
		}
		else{
			System.out.println("Even Number.");
		}
	}

}
