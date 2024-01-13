package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double priceDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		
		double converter = CurrencyConverter.converter(priceDolar, dolar);
		
		System.out.printf("Amount to be paid in reais = %.2f", converter);
		
		sc.close();
	}

}
