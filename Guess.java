import java.util.Scanner;
import java.util.Random;

class Guess {

	public static void main(String[] args) {

		Random random = new Random();
		int r = random.nextInt(1000) + 1;

		Scanner scanner = new Scanner(System.in);


		System.out.println("Guess a number between 1 - 1000");


		for (int i=0; i<7; i++){

			int guess = scanner.nextInt();
			if (guess == r){
				System.out.println("YOU GUESSED RIGHT!!");
				System.exit(0);
			}

			if (guess > r){
				System.out.println("You are too high.");
			}
			 
			if (guess < r){
				System.out.println("You are too low.");
			}
		}

		System.out.println("You Lose. The number was " + r + ".");
		
	}
}