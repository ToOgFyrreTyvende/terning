// Program: Terning
// Version: 2.00
// Date created: 2014-06-10
// Last modified: 2016-09-24
// Author: Bjørn Christensen 
// Modified by: Agner Fog

// Description:
// This program simulates roll of a die
// It has three errors:
// 1. The program asks the user how many times he wants the dice to roll.
//    If he doesn´t enter a valid number the program will crash.
// 2. The program rolls the dice one time less than asked
// 3. The dice is not symetric. It will roll too few ones and six'es

package terning;

import java.util.Scanner;

public class UseDice {

	public static void main(String[] args) {
		terning.Dice cup = new terning.Dice();   // Make an instance of Dice
		Scanner keyboard=new Scanner(System.in);   // Make an instance of keyboard Scanner
		System.out.println("Welcome to the diceroll program");
		System.out.println("How many times do you want to roll the dice?");
		int n = correctInput(keyboard);  // Read input, which should only be an int
		cup.rollMultiple(n);         // Roll the dice n times
		keyboard.close();            // Close the scanner
	}
	private static int correctInput(Scanner keyboard) {
		boolean caught = false;
		int input = 0;

		// Udarbejdet med inspiration Opgave 2, lavet af Ahmad og fra fra https://stackoverflow.com/a/32593462/3742885
		do {
			if (keyboard.hasNextInt()) {
				input = keyboard.nextInt();
				caught = true;
			} else {
				keyboard.nextLine();
				// Vi bruger \r, eller carriage return, for at overskrive
				// samme linje hvis funktionskaldet bliver kaldt flere gange uden brugerinput
				System.out.print("\rPlease input a correct input: ");
			}
		} while (!caught);
		return input;
	}
}
