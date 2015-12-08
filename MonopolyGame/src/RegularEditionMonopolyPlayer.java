import java.util.ArrayList;
import java.util.Scanner;
public class RegularEditionMonopolyPlayer
	{
		
		static Scanner Player=new Scanner(System.in);
		public static boolean playerMove=true;
		static int rollDice;
		static int Dice1;
		static int Dice2;
		static int Position=0;
		static int price;
		static int Credits=1500;
		static ArrayList<String>ownedProp = new ArrayList<String>();
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
						if((Position + rollDice) >= 40) 
							{
							Credits += 200;
							System.out.println("You received $200 for passing or landing on go");
							System.out.println("Your balance is "+ Credits +" Credits");
							}
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
								System.out.println("You Rolled a "+rollDice+", You Landed on "+MonopolyBoard.properties.get(Position).getName());	
							}
						if(MonopolyBoard.properties.get(Position).isCanBuy() == true)
							{
								if(MonopolyBoard.properties.get(Position).isPurchased() == false) 
									{
										System.out.println("Buy " + MonopolyBoard.properties.get(Position).getName() + " for $" + MonopolyBoard.properties.get(Position).getPrice());
										System.out.println("Press 1 to buy, 2 to pass");
										if(Player.nextInt() == 1) 
											{
												if(Credits >= MonopolyBoard.properties.get(Position).getPrice())
													{
														MonopolyBoard.properties.get(Position).setPurchased(true);
														Credits -= MonopolyBoard.properties.get(Position).getPrice();
														//System.out.println("You bought " + StarWarsBoard.properties.get(0).getName());
														System.out.println("Your balance is " + Credits+" Credits");
														System.out.println(" ");
														System.out.println("Your Properties:");
														ownedProp.add(new String(MonopolyBoard.properties.get(Position).getName()));
														for(String myProp: ownedProp) 
															{
																System.out.println(myProp);
															}
														System.out.println(" ");
													} 
												else 
													{
														System.out.println("You do not have enough money");	
													}
											} 
										
									}
								else if(Position == 4) 
									{
										if(Credits >= 200) 
											{
												Credits -= 200;
												System.out.println("You paid 200 Credits for Income Tax");
											} 
										else 
											{
												System.out.println("You do not have enough money to pay for Income Tax");
											}
									} 
								else if(Position == 38)
									{
										if(Credits >= 75)
											{
												Credits -= 75;
												System.out.println("You paid 75 Credits for Luxary Tax");
											} 
										else 
											{
												System.out.println("You do not have enough money to pay for Luxary Tax");
											}
									}
							}
					}
			}
	}