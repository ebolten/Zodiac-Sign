import java.util.Scanner;
public class ZodiacSign {

	public static void main(String[] args) {
		//This program will print the user's zodiac sign
		
		int Year;
		int ZodiacSign;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year you were born: ");
		Year = input.nextInt();
		
		ZodiacSign = Year % 12;
		
		if(ZodiacSign == 0) {
			System.out.println("Your Zodiac Sign is a Monkey.");
		}
		else if(ZodiacSign == 1) {
			System.out.println("Your Zodiac Sign is a Rooster.");
		}
		else if(ZodiacSign == 2) {
			System.out.println("Your Zodiac Sign is a Dog.");
		}
		else if(ZodiacSign == 3) {
			System.out.println("Your Zodiac Sign is a Pig.");
		}
		else if(ZodiacSign == 4) {
			System.out.println("Your Zodiac Sign is a Rat.");
		}
		else if(ZodiacSign == 5) {
			System.out.println("Your Zodiac Sign is a Ox.");
		}
		else if(ZodiacSign == 6) {
			System.out.println("Your Zodiac Sign is a Tiger.");
		}
		else if(ZodiacSign == 7) {
			System.out.println("Your Zodiac Sign is a Rabbit.");
		}
		else if(ZodiacSign == 8) {
			System.out.println("Your Zodiac Sign is a Dragon.");
		}
		else if(ZodiacSign == 9) {
			System.out.println("Your Zodiac Sign is a Snake.");
		}
		else if(ZodiacSign == 10) {
			System.out.println("Your Zodiac Sign is a Horse.");
		}
		else if(ZodiacSign == 11) {
			System.out.println("Your Zodiac Sign is a Sheep.");
		}
		else {
			System.out.println("ERROR");
		}
		
		
		
		
		
		
	}

}
