public class Ownable extends BoardSpace
	{
		public Ownable(String n, int p, boolean pu, boolean cb)
			{
				name=n;
				price=p;
				purchased=pu;
				canBuy = cb;
			}
		protected static String name;
		protected static int price;
		protected boolean canBuy;
		protected boolean purchased;
		boolean isCanBuy()
			{
				return canBuy;
			}
		private void setCanBuy(boolean canBuy)
			{
				this.canBuy = canBuy;
			}
		boolean isPurchased()
			{
				return purchased;
			}
		void setPurchased(boolean purchased)
			{
				this.purchased = purchased;
			}
		int getPrice()
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
	}