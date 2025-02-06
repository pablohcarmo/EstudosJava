package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double IOFCalculator(double dollarPrice, double dollarAmount) {
		double reaisAmount = dollarPrice * dollarAmount;
		double tax = reaisAmount * IOF;
		return reaisAmount + tax;
	}
}