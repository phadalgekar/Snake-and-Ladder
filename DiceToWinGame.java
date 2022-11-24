package snakeLadder;

public class DiceToWinGame {
	final static int source =0;
	final static int destination =100;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		int position =0;
		int diceRoll =0;
		while (position != destination)
		{
			diceRoll++;
			int randomCheck = (int) Math.floor(Math.random ()* 10) % 6+1;
			int randomCheck2 = (int) (Math.random()* 10 )% 3;
			switch (randomCheck2) {
				case 0:
					System.out.println("No Play");
					position +=0;
					break;
				case 1:
					System.out.println("Ladder");
					position +=randomCheck;
					break;
				case 2:
					System.out.println("Snake");
					position -=randomCheck;
					break;
		}
			if (position == 100) {
				break;   
			} else if (position > 100) {
                position -= randomCheck;
                System.out.println("Invalid Dice Face. You are staying on same position.");
            } else if (position < 0) {
                position = source;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position: " + position);
            }
			
			}
		System.out.println("You won the game.");
		System.out.println("Number of times diceroll is:" +diceRoll); 
	}}
	


