import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MonopolyBoard
	{
		static ArrayList<BoardSpace> properties = new ArrayList<BoardSpace>();
		
		static void makeBoard()
			{
				
				properties.add(new Unownable("Go",false));
				properties.add(new Ownable("Mediterranean Avenue",60,false,true));
				properties.add(new CommunityChestAndChance("Community Chest",false));
				properties.add(new Ownable("Baltic Avenue",60,false,true));
				properties.add(new Unownable("Income Tax Pay 10% or $200",false));
				properties.add(new Ownable("Reading Railroad",200,false,true));
				properties.add(new Ownable("Oriental Avenue",100,false,true));
				properties.add(new CommunityChestAndChance("Chance",false));
				properties.add(new Ownable("Vermont Avenue",100,false,true));
				properties.add(new Ownable("Connecticut Avenue",123,false,true));
				properties.add(new Unownable("Jail",false));
				properties.add(new Ownable("St. Charles Place",140,false,true));
				properties.add(new Ownable("Electric Company",150,false,true));
				properties.add(new Ownable("States Avenue",140,false,true));
				properties.add(new Ownable("virginia Avenue",160, false,true));
				properties.add(new Ownable("Pennsylvania Railroad",200,false,true));
				properties.add(new Ownable("St.James Place",180,false,true));
				properties.add(new CommunityChestAndChance("Community Chest",false));
				properties.add(new Ownable("Tennessee Avenue",180,false,true));
				properties.add(new Ownable("New York Avenue",200,false,true));
				properties.add(new Unownable("Free Parking",false));
				properties.add(new Ownable("Kentucky Avenue",220,false,true));
				properties.add(new CommunityChestAndChance("Chance",false));
				properties.add(new Ownable("Indiana Avenue",220,false,true));
				properties.add(new Ownable("Illinois Avenue",240,false,true));
				properties.add(new Ownable("B. & O. Railroad",200,false,true));
				properties.add(new Ownable("Atlantic Avenue",260,false,true));
				properties.add(new Ownable("Ventnor Avenue",260,false,true));
				properties.add(new Ownable("Water Works",150,false,true));
				properties.add(new Ownable("Marvin Gardens",280,false,true));
				properties.add(new Unownable("Go To Jail",false));
				properties.add(new Ownable("Pacific Avenue",300,false,true));
				properties.add(new Ownable("North Carolina Avenue",300,false,true));
				properties.add(new CommunityChestAndChance("Community Chest",false));
				properties.add(new Ownable("Pennsylvania Avenue",320,false,true));
				properties.add(new Ownable("Short Line",200,false,true));
				properties.add(new CommunityChestAndChance("Chance",false));
				properties.add(new Ownable("Park Place",350,false,true));
				properties.add(new Unownable("Luxury Tax pay $75 ",false));
				properties.add(new Ownable("Boardwalk",400,false,true));

			}
	}
