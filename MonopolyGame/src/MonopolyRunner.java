import java.util.Scanner;
import java.util.ArrayList;
public class MonopolyRunner
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
		System.out.println("Hello would you rather like to play Star Wars Edition Monopoly or Regular Monopoly?");
		System.out.println(" (1) Star Wars Edition");
		System.out.println(" (2) Regular Edition");
		int choice = userInput.nextInt();
		if (choice == 1)
			{
				System.out.println("You begin the game with 1500 credits." );
				Introduction.wouldYouLikeToPlay();
				StarWarsBoard e = new StarWarsBoard();
				e.makeStarWarsBoard();
				PlayerDice.moveSpace();
			}
		if (choice == 2) 
			{
			System.out.println("Your begin the game with 1500 credits." );
			Introduction.wouldYouLikeToPlay();
			MonopolyBoard a = new MonopolyBoard();
			a.makeBoard();
			RegularEditionMonopolyPlayer.moveSpace();
			}				
				
		}
		
	}



