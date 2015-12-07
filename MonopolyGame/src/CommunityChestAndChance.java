
public class CommunityChestAndChance extends BoardSpace
	{

		protected static String name;
		protected boolean canBuy;
	public CommunityChestAndChance(String n, boolean cb)
		{
					setName(n);
					setCanBuy(cb);
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			CommunityChestAndChance.name = name;
		}
	boolean isCanBuy()
		{
			return canBuy;
		}
	private void setCanBuy(boolean canBuy)
		{
			this.canBuy = canBuy;
		}

	}
