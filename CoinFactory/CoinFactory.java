public class CoinFactory extends SourceCoinFactory{

	@Override
	public Coin getCoinType(String type) {
		if(type.equals("Cent"))
			return new Cent();
		else if(type.equals("Dollar"))
			return new Dollar();
		else if(type.equals("Nickel"))
			return new Nickel();
		else
			return null;
		
	}
 
 }