package main;
import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		int menuSelection;
		do {
			menuSelection = Converter();
			switch(menuSelection) {
			case 1:
				System.out.println("1. Cups to Teaspoons");
				break;
			case 2: 
				System.out.println("2. Miles to Kilometers");
				break;
			case 3: 
				System.out.println("3. US Gallons to Imperial Gallons");
				break;
			case 4:
				System.out.println("4. Quit");
				break;
			}
		} while(menuSelection != 4);						
		
	}
	
	public static int Converter() {
		int selection;
		Scanner in = new Scanner(System.in);
		System.out.println("Please select an option: ");
		selection = in.nextInt();
		System.out.println("You have selected: " + selection);
		return selection;
	}
}	
	



	
