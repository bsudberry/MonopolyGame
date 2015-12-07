import java.util.Scanner;
import java.util.ArrayList;
public class MonopolyRunner
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
				Introduction.wouldYouLikeToPlay();
				StarWarsBoard e = new StarWarsBoard();
				e.makeStarWarsBoard();
				PlayerDice.moveSpace();
		}
		
	}



