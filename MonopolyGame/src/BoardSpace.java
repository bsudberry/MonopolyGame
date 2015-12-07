
public abstract class BoardSpace
	{
		protected String name;
		protected  int price;
		protected boolean canBuy;
		protected boolean purchased;
		int getPrice()
			{
				return price;
			}
		private void setPrice(int price)
			{
				this.price = price;
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
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}

	}

