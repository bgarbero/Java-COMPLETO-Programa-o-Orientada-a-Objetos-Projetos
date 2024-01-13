package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter (double priceDolar, double dolar){
		return ((dolar * IOF) + dolar) * priceDolar; //melhor seria: dolar * priceDolar (1 + IOF). 
	}
}
