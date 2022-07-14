package MIDTERMS;
import java.util.Scanner;
import Converter.CurrencyConverter;
import Servicecon.CurrencyConverterService;

public class Application {


	int ch;
	String again;
	Scanner sc= new Scanner(System.in);

	public void displayMenu(){

		System.out.println("*********Welcome to BINS CURRENCY CONVERTER***********");
		System.out.println("=================================================================");
		System.out.println("	Enter 1 to continue to the Currency Converter");
		System.out.println("	Enter 2 to exit to the Currency Converter    ");
		System.out.println("=================================================================");
	}


	public void order()
	{
		while(true){
			System.out.print("Enter Your Choice: ");
			ch = sc.nextInt();
			switch (ch){
				case 1://Converter
				System.out.println("*********Welcome to BINS CURRENCY CONVERTER***********");
				System.out.println("Convert your money to \n(1) PHP to Dollar\n(2) Dollar to PHP\n(3) PHP to Euro\n(4) Euro to PHP");
				System.out.println("Select Currency to convert:");
				String currency = sc.next();
				

				System.out.println("Enter Amount:");
				Double amount = sc.nextDouble();
				
				CurrencyConverter converter = new CurrencyConverter(currency,amount);
				CurrencyConverterService converterService = new CurrencyConverterService();
				
				Boolean flag= converterService.currencyConverter(converter);
				
				if(flag)
				System.out.println("Converted Amount : "+converterService.getConvertedAmount()+" "+currency);
				break;

				case 2: //exit
				System.exit(1);
				break;

				default:
					break;
			}
			

			System.out.println();
			System.out.println("Do you wish to select again? (Y/N) : ");
			again = sc.next();
			if(again.equalsIgnoreCase("Y"))
			{order();}
			else if (again.equalsIgnoreCase("N"))
			{
			System.exit(1);}
			else{System.out.println("Invalid Choice");}
		}
	}
}




