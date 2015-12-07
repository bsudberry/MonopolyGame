
public class Unownable extends BoardSpace
	{
		protected String name;
		protected boolean canBuy;
		
		public Unownable(String n, boolean cb)
			{
				setName(n);
				setCanBuy(cb);
			}
		
		boolean isCanBuy()
			{
				return canBuy;
			}
		private void setCanBuy(boolean canBuy)
			{
				this.canBuy = canBuy;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
	}
