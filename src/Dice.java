import java.util.Scanner;

public class Dice {

		Scanner hadouken = new Scanner(System.in);

		private int diceTotal;
		private int hiAndLowOrMid;
		private String guess;
		private int midGuess;
		int points = 0 ; 

		// Constructor
		public Dice(int dice, String userGuess, int highOrLow ) 
		{
// As is, this constructor can only handle 3 dice.  Since you have the number of dice, the 6/12/18 below should just be dice*6,
// then you can handle any number of dices, rigght?
			switch (dice)
			{
			case 1: diceTotal = 1 + (int) (Math.random() * 6); break;
			case 2: diceTotal = 1 + (int) (Math.random() * 12); break;
			case 3: diceTotal = 1 + (int) (Math.random() * 18); break;
			}
			
			guess = userGuess;
			hiAndLowOrMid = highOrLow;
		
		}

		// Will return if the user is too low, too high, or just right
		public void hiAndLow() 
		{
			if (diceTotal >= hiAndLowOrMid && guess.equals("hi"))
			{
				System.out.println("your right");
				System.out.print("Dice Total: " + diceTotal);
				points++;
			}
			else if (diceTotal <= hiAndLowOrMid && guess.equals("low"))
			{
				System.out.println("your right ");
				System.out.print("Dice Total: " + diceTotal);
				points++;
			}
			else if (diceTotal == hiAndLowOrMid && guess.equals("mid"))
			{
				System.out.println("your right ");
				System.out.print("Dice Total: " + diceTotal);
				points += 5;
			}
			else 
			{
				System.out.println("your wrong ");
				System.out.print("Dice Total: " + diceTotal);
				points += -1;
			}
			
		}
		
		public int getPoints() 
		{
			return points; // returns points to main 
		}

		// Output
		public void output() 
		{
			System.out.println("\nyour guess: " + guess);
			hiAndLow();
	
		}
}
	
	
	
