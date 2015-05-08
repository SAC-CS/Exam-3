import java.util.Scanner; 

public class HighLowGame {
	
	public static void main(String[] args) {
		
		Scanner hadouken = new Scanner(System.in);
		
				// My variables
				int dice;// dice 1 ,2, or 3?
				String userGuess;// high or low?
				int timesPlayed = 1;// will count how many times the user has played
				String playAgain;
				boolean playingGame = true;
				int points = 0;
				int diceMid = 0;
				
				// user input
				System.out.println("out of 3..how many dices would you like to play with?: ");
				dice = hadouken.nextInt();

				do {
					// Based off of dice it will call upon one of 3 if statements
					if (dice == 1 || dice == 2 || dice == 3)
					{

						System.out.println("high or low or mid?");
						userGuess = hadouken.next();
						
						if (dice == 1)
						{
							diceMid = 3;
						}
						if (dice == 2)
						{
							diceMid = 6;
						}
						if (dice == 3)
						{
							diceMid = 9;
						}

						Dice guy = new Dice(dice, userGuess, diceMid); // calls oneDice class and gives it values to work with
						guy.output(); // calls the output
						points += guy.getPoints();
						

					} 
					
					else 
					{
						System.out.println("either 1,2, or 3, dices...no more..no less..");
					}

					System.out.println("\n play/try again?? (y/n)");
					playAgain = hadouken.next();

					if (playAgain.equals("y")) {
						timesPlayed++; // counts times played and decides to play again or not
					} else {
						System.out.println("\n ok, goodbye..");
						System.out.println("times played:" + timesPlayed);
						System.out.println("\n points:" + points);
						playingGame = false; // sets the boolean ( playing game ) to false therefore ending it
					}
				} while (playingGame == true);// if ( playingGame ) is still true.. it will keep playing
			
	}//ends Main

} //ends HighLowGame Class