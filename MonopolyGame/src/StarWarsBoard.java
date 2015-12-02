import java.util.ArrayList;


public class StarWarsBoard
	{
static ArrayList<String> properties = new ArrayList<String>();
		
		public static void main(String[] args)
			{	
				makeStarWarsBoard();
			
			}
		
		static void makeStarWarsBoard()
			{
				
				properties.add("Go");
				properties.add("Swamp - Dagobah");
				properties.add("Rebel Scum");
				properties.add("Yoda's Hut - Dagobah");
				properties.add("Docking Tax");
				properties.add("TIE Fighter");
				properties.add("Echo Base - Hoth");
				properties.add("Imperial Chance");
				properties.add("Frozen Plains - Hoth");
				properties.add("North Ridge - Hoth");
				properties.add("CARBONATION ");
				properties.add("Lars Homestead - Tatooine");
				properties.add("Reactor Core");
				properties.add("Mos Eisley");
				properties.add("Yoda's Other Swamp - Tatooine");
				properties.add("Millennium Falcon");
				properties.add("War Room - Yavin Four");
				properties.add("Rebel Scum");
				properties.add("Massassi Temple - Yavin Four");
				properties.add("Temple Throne Room - Yavin Four");
				properties.add("Free Fighter Parking");
				properties.add("Landos Platform - Cloud City");
				properties.add("Imperial Chance");
				properties.add("Carbon Freezing Chamber - Cloud City");
				properties.add("Reactor Control Room - Cloud City");
				properties.add("X-Wing Fighter");
				properties.add("Landing Bay - Death Star");
				properties.add("Throne Room - Death Star");
				properties.add("Moisture Farm");
				properties.add("Central Core - Death Star");
				properties.add("It's a Trap!");
				properties.add("Forest - Endor");
				properties.add("Shield Generator - Endor");
				properties.add("Rebel Scum");
				properties.add("Shield Generator - Endor");
				properties.add("Ewok Village - Endor");
				properties.add("Star Destroyer");
				properties.add("Imperial Chance");
				properties.add("Monument Square - Coruscant");
				properties.add("Imperial Palace - Coruscant");
			
				for(int j=0;j<1;j++)
					{
					//BoardSpace [j]= " ";
					System.out.println(properties);
					}	
			}
	}
