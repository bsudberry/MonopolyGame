
public abstract class BoardSpace
	{
		protected static String name;
		protected static int space;
		protected static int price;
		
		
		private static int getPrice()
			{
				return price;
			}
		private static void setPrice(int price)
			{
				BoardSpace.price = price;
			}
		public static String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public static int getSpace()
			{
				return space;
			}
		public void setSpace(int space)
			{
				this.space = space;
			}
	}