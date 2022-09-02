import java.util.Scanner;

public class GuessingGameDeluxe {

	public static void main(String[] args) {

		int randomNumber1 = (int) Math.floor(Math.random() * 10);
		int randomNumber2 = (int) Math.floor(Math.random() * 10);
		int randomNumber3 = (int) Math.floor(Math.random() * 10);

		boolean wrongAnswer = true;

		while (wrongAnswer) {

			Scanner guessNumber1 = new Scanner(System.in);
			System.out.print("Guess Number 1: ");
			int guess1 = guessNumber1.nextInt();

			Scanner guessNumber2 = new Scanner(System.in);
			System.out.print("Guess Number 2: ");
			int guess2 = guessNumber2.nextInt();

			Scanner guessNumber3 = new Scanner(System.in);
			System.out.print("Guess Number 3: ");
			int guess3 = guessNumber3.nextInt();

			if (randomNumber1 == guess1)
				System.out.print("O");
			else if (randomNumber2 == guess1 || randomNumber3 == guess1)
				System.out.print("?");
			else
				System.out.print("X");

			if (randomNumber2 == guess2)
				System.out.print("O");
			else if (randomNumber1 == guess2 || randomNumber3 == guess2)
				System.out.print("?");
			else
				System.out.print("X");

			if (randomNumber3 == guess3)
				System.out.println("O");
			else if (randomNumber1 == guess3 || randomNumber2 == guess3)
				System.out.println("?");
			else
				System.out.println("X");

			if (randomNumber1 == guess1 && randomNumber2 == guess2 && randomNumber3 == guess3) {
				System.out.println("Correct Guess ;)");
				wrongAnswer = false;
				guessNumber1.close();
				guessNumber2.close();
				guessNumber3.close();
			}
			else 
				System.out.println("Wrong Number, Try Again");
		}

	}

}
