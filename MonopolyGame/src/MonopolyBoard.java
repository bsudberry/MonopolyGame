import java.util.ArrayList;


public class MonopolyBoard
	{
		public static String [] board=new String [40];
		static ArrayList <String> properties = new ArrayList <String>();
		public static void main(String[] args)
			{
				makeBoard();
			}
		private static void makeBoard()
			{
				properties.add("Go");
				properties.add("Mediterranean Avenue");
				properties.add("Community Chest");
				properties.add("Baltic Avenue");
				properties.add("Income Tax");
				properties.add("Reading Railroad");
				properties.add("Oriental Avenue");
				properties.add("Chance");
				properties.add("Vermont Avenue");
				properties.add("Connecticut Avenue");
				properties.add("Jail");
				properties.add("St. Charles Place");
				properties.add("Electric Company");
				properties.add("States Avenue");
				properties.add("virginia Avenue");
				properties.add("Pennsylvania Railroad");
				properties.add("St.James Place");
				properties.add("Community Chest");
				properties.add("Tennessee Avenue");
				properties.add("New York Avenue");
				properties.add("Free Parking");
				properties.add("Kentucky Avenue");
				properties.add("Chance");
				properties.add("Indiana Avenue");
				properties.add("Illinois Avenue");
				properties.add("B. & O. Railroad");
				properties.add("Atlantic Avenue");
				properties.add("Ventnor Avenue");
				properties.add("Water Works");
				properties.add("Marvin Gardens");
				properties.add("Go To Jail");
				properties.add("Pacific Avenue");
				properties.add("North Carolina Avenue");
				properties.add("Community Chest");
				properties.add("Pennsylvania Avenue");
				properties.add("Short Line");
				properties.add("Chance");
				properties.add("Park Place");
				properties.add("Luxury Tax");
				properties.add("Boardwalk");
				
				for(int j=0;j<1;j++)
					{
					board [j]= " ";
					System.out.println(properties);
					}
				
				
			}

	}
