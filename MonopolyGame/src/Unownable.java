
public class Unownable  
	{
		protected static String name;
		protected boolean canBuy;
		
		public Unownable(String n, boolean cb)
			{
				name=n;
				canBuy = cb;
			}
		
		boolean isCanBuy()
			{
				return canBuy;
			}
		private void setCanBuy(boolean canBuy)
			{
				this.canBuy = canBuy;
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
