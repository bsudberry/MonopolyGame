import java.util.Scanner;


public class Introduction
	{
		 static String playOrNo;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				wouldYouLikeToPlay();
			}
		static void wouldYouLikeToPlay()
			{
				System.out.println("Hello Would you like to play Monopoly?"+ " Please insert Yes or No.");
				System.out.println(" (1) yes");
				System.out.println(" (2) No");
				int choice = userInput.nextInt();
				if (choice == 1)
					{
					System.out.println("Okay great! Lets go.");
					}
				if (choice == 2) 
					{
					System.out.println("Alright, maybe another time.");
					System.exit(0);
					}				
			}

	}
