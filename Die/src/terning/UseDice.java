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
		Dice cup = new Dice();   // Make an instance of Dice
		Scanner keyboard=new Scanner(System.in);   // Make an instance of keyboard Scanner
		System.out.println("Welcome to the diceroll program");
		for(int tries=3; tries>0; tries--) {
			System.out.println("How many times do you want to roll the dice?");
			String n = keyboard.next();  // Read integer
			if(n.matches("^\\d+$"))//
			{
				cup.rollMultiple(Integer.parseInt(n));         // Roll the dice n times	
			}else {
			 
				System.out.println("Not compatible input, try again");
				if(tries==2) {
					System.out.println("You have "+(tries-1)+" try left");
				}else {
					System.out.println("You have "+(tries-1)+" tries left");
				}
						
			}
		
		}
		keyboard.close();  
		System.out.println("Out of tries. Reboot program for more tries");
	}
}

