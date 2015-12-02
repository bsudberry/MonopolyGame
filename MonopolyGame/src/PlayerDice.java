
import java.util.Scanner;
public class PlayerDice
	{
		
		static Scanner Player=new Scanner(System.in);
		public static boolean playerMove=true;
		static int rollDice;
		static int Dice1;
		static int Dice2;
		static int Position=0;
		public static void main(String[] args)
			{	
			moveSpace();
			}

		static void moveSpace()
			{
				while(playerMove)
					{
						Dice1=((int)(Math.random()*6)+1);
						Dice2=((int)(Math.random()*6)+1);
						rollDice=Dice1+Dice2;
						if (Dice1==Dice2)
							{
								System.out.println("Doubles!");
							}	
						System.out.println("You are currently rolling the dice!");
						Object player;
						if(Player.hasNextLine())
							{
								Player.nextLine();
								Position=(Position+rollDice)%40;
								System.out.println("You Rolled a "+rollDice+", You Landed on "+StarWarsBoard.properties.get(Position));	
							}
						if(Position >= 40)
							{
								Position -=40;
								System.out.println("You passed Go! Collect $200.");
								//p.addMoney(200);
							}
					}
				
			}
	}