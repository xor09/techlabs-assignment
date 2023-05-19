package com.techlabs.assignments;
import java.util.Scanner;
import java.util.Random;

public class PigDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		Random random = new Random();
		
		final int requiredScore = 20;
		int turn = 0, score = 0;
		
		while(score < requiredScore) {
			++turn;
			score += rollDice(0, random, scanner);
			System.out.println("Turn #" + turn + " over.\tYour current score is " + score);
		}
		
		System.out.println("You finished in " + turn + " turns.");
		scanner.close();
	}
	
	
	private static int rollDice(int currentScore, Random random, Scanner scanner) {
		System.out.println("To roll a dice press 'r' or to hold press 'h'.");
		String input = scanner.next();
		if(input.equalsIgnoreCase("r")) {
			int dice = random.nextInt(6)+1;
			System.out.println("dice: " + dice); //check the value of dice
			if(dice == 1) return 0;
			return rollDice(currentScore+dice, random, scanner);
		}
		else if(input.equalsIgnoreCase("h")) {
			return currentScore;
		}
		else {
			System.out.println("Enter a valid input!");
			return rollDice(currentScore, random, scanner);
		}
	}

}
