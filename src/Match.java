import java.util.ArrayList;
import java.util.Collections;

public class Match {
	//constructor
	/**
	 * a match with one player
	 * @param player1
	 * @param player2
	 */
	public Match(Player player1, Player player2) {
		
	}
	
	/**
	 * a match with one player, and computer
	 * @param player1
	 */
	public Match(Player player1) {
		Deck deck = new Deck();
		for (int i=0; i<10; i++) {
			
			System.out.println("Player's turn: Draw");
			player1.draw(deck);
			System.out.println("DEBUG:: " + player1.getCards() + ":: check? " + check(player1));
			
		}
	}
	
	/**
	 * it's a book if all four cards are of the same rank but of unique suits
	 * @param a first card
	 * @param b second card
	 * @param c third card
	 * @param d forth card
	 * @return true if all four cards are same rank but unique suit
	 */
	public boolean isBook(Card a, Card b, Card c, Card d) {
		//check if all the cards are of the same rank
		if (a.getRank() != b.getRank() || c.getRank() != d.getRank()) {
			return false;
		}
		//check if same suit
		if (a.getSuit() != b.getSuit()) {
			return false;
		}
		if (b.getSuit() != c.getSuit()) {
			return false;
		}
		if (c.getSuit() != d.getSuit()) {
			return false;
		}
		return true;
	}
	
	/**
	 * assuming player hand is ordered
	 * @param p player
	 * @return true if player has a book
	 */
	public boolean check(Player p) {
		//player has at least 4 cards
		int hand = p.getCards().size()-1;
		if (hand < 3) {
			return false;
		}
		System.out.println("HAND :" + p.getCards().size());
		
		//check 4 consecutive cards, and move up till end of hand
		for (int i = 0; i < hand; i++) {
			//if the four is a book
			if (isBook(p.getCards().get(i),p.getCards().get(i+1),p.getCards().get(i+2),p.getCards().get(i+3))) {
				System.out.println("---" + isBook(p.getCards().get(i),p.getCards().get(i+1),p.getCards().get(i+2),p.getCards().get(i+3)));
				return true;
			}
			//if not enough cards left
			if ((hand-3)>=0) {
				break;
			}
		}
		return false;
	}
}
