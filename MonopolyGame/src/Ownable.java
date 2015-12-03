public class Ownable extends BoardSpace
	{
		public Ownable(String n, int p, boolean pu, boolean cb)
			{
				name=n;
				price=p;
				purchased=pu;
				canBuy = cb;
			}
	}