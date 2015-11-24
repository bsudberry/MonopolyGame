
public class PlayerDice
	{
		static int Dice1;
		static int Dice2;
		static int total;
		public static void main(String[] args)
			{
		    DiceRoll();
			}

		private static void DiceRoll()
			{
				Dice1 = (int) ((Math.random()*6)+1);
				Dice2 = (int) ((Math.random()*6)+1);
				total = Dice1+Dice2;
				System.out.println("You rolled a "+ Dice1 + " and a "+ Dice2 +".  For a total of "+ total);
			}

	}
