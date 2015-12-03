import java.util.ArrayList;


public class StarWarsBoard
	{
static ArrayList<BoardSpace> properties = new ArrayList<BoardSpace>();
		
		public static void main(String[] args)
			{	
				makeStarWarsBoard();
			
			}
		
		static void makeStarWarsBoard()
			{
				
				properties.add(new Unownable ("GO",false));
				properties.add(new Ownable("Naboo Swamps",60,false,true));
				properties.add(new CommunityChestAndChance("Jedi",false));
				properties.add(new Ownable("Naboo Plains",60,false,true));
				properties.add(new Unownable("Trade Route Tax Pay 200 Credits ",false));
				properties.add(new Ownable("Podracer Sebulba's",200,false,true));
				properties.add(new Ownable("Trade Federation Battle Ship Hanger Bay",100,false,true));
				properties.add(new CommunityChestAndChance("Sith",false));
				properties.add(new Ownable("Trade Federation Battleship Conference Room",100,false,true));
				properties.add(new Ownable("Trade Federation Battleship Control Center",120,false,true));
				properties.add(new Unownable("In Jail/Just Visiting",false));
				properties.add(new Ownable("Mos Espa Anakin's Room",140,false,true));
				properties.add(new Ownable("Theed Power Generator",140,false,true));
				properties.add(new Ownable("Mos Espa Watto's Junk Shop",140,false,true));
				properties.add(new Ownable("Mos Espa Street Market",160,false,true));
				properties.add(new Ownable("Podracer Gasgano's",200,false,true));
				properties.add(new Ownable("Mos Espa Arena Watto's Box",180,false,true));
				properties.add(new CommunityChestAndChance("Jedi",false));
				properties.add(new Ownable("Mos Espa Arena Jabba's Box",180,false,true));
				properties.add(new Ownable("Mos Espa Arena Starting Grid",200,false,true));
				properties.add(new Unownable("Free Parking",false));
				properties.add(new Ownable("Otoh Gunga Plaza",220,false,true));
				properties.add(new CommunityChestAndChance("Sith",false));
				properties.add(new Ownable("Otoh Gunga High Tower Board Room",220,false,true));
				properties.add(new Ownable("Otoh Gunga Gungan Sub",240,false,true));
				properties.add(new Ownable("Podracer Anakin's",200,false,true));
				properties.add(new Ownable("Theed Energy Beem Hallway",260,false,true));
				properties.add(new Ownable("Theed Generator Core",260,false,true));
				properties.add(new Ownable("Moisture Farm",150,false,true));
				properties.add(new Ownable("Theed Main Hanger",280,false,true));
				properties.add(new Unownable("Go To Jail",false));
				properties.add(new Ownable("Theed Palace Courtyard",300,false,true));
				properties.add(new Ownable("Theed Palace Main Palace",300,false,true));
				properties.add(new CommunityChestAndChance("Jedi",false));
				properties.add(new Ownable("Theed Palace Throne Room",320,false,true));
				properties.add(new Ownable("Podracer Cleggs's",200,false,true));
				properties.add(new CommunityChestAndChance("Sith",false));
				properties.add(new Ownable("Coruscant Galactic Senate",350,false,true));
				properties.add(new Unownable("Blockade   Pay 75 Credits",false));
				properties.add(new Ownable("Coruscant Jedi Council",400,false,true));
				
				for(BoardSpace object: properties)
					{
					  System.out.print(StarWarsBoard.properties);
					}
			}

	
	}
