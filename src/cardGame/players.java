package cardGame;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class players {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * calling methods here in main method to run the program
		 */
		System.out.println("\nPress 1 > for view 4 players cards");
		deckOfCards play = new deckOfCards();
		Scanner scanner = new Scanner(System.in);
		int press = scanner.nextInt();

		switch (press) {
		case 1:
			play.getCardCombination();
			play.getPlayer();
			break;
		}
		scanner.close();
	}
}
