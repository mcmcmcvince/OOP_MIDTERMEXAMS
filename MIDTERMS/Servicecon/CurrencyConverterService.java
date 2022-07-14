package Servicecon;
import Converter.CurrencyConverter;
public class CurrencyConverterService {
	Double convertedAmount = 0d;
	public Boolean currencyConverter(CurrencyConverter currencyConverter) {
		String currency = currencyConverter.getCurrency();
		Double amount = currencyConverter.getAmount();
		Double rate=0d;
		Boolean flag = true;
		if(currency.equalsIgnoreCase("1")) {
			rate=0.018;  				// 1 Peso = 0.018 USD Dollar
		}else if(currency.equalsIgnoreCase("2")) {
			rate=56.42;					// 1 Dollar = 56.42 Peso 
		}else if(currency.equalsIgnoreCase("3")) {
			rate=0.018; 				// 1 Peso = 0.018 Euro
		}else if(currency.equalsIgnoreCase("4")) {
			rate = 56.45;				// 1 Euro= 56.45 Peso
		}else {
			flag= false;	
			System.out.println("Currency not Supported !");
		}
		convertedAmount= amount*rate;
		return flag;
	}
	public Double getConvertedAmount() {
		return convertedAmount;
	}
}