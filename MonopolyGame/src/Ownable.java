public class Ownable extends BoardSpace
	{
		protected String name;
		protected int price;
		protected boolean canBuy;
		protected boolean purchased;
		
		public Ownable(String n,int p, boolean pu, boolean cb)
			{
				setName(n);
				setPrice(p);
				setPurchased(pu);
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
		private void setPrice(int price)
			{
				this.price = price;
			}
		
	}