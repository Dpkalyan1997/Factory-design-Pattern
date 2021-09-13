
public class TestCoinFactory {

	public static void main(String[] args) {
SourceCoinFactory factory=CoinCreator.getSourceCoinFactory();
System.out.println("Cent="+factory.getCoinType("Cent").getValue());

SourceCoinFactory factory1=CoinCreator.getSourceCoinFactory();
System.out.println("Nickel="+factory1.getCoinType("Nickel").getValue());

SourceCoinFactory factory2=CoinCreator.getSourceCoinFactory();
System.out.println("Dollar="+factory2.getCoinType("Dollar").getValue());


	}

}
