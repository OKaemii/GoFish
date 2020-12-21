import java.util.ArrayList;

/**
 * a deck of 52 cards
 */
public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	/**
	 * initialise a full deck of cards (ordered)
	 * no jokers
	 */
	public Deck() {
		// initialise a full deck of cards
		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				cards.add(new Card(r.ordinal(), s.ordinal()));
			}
		}

	}
	
	
	public Card draw() {
		// take from the top of the deck
		int topOfDeck = cards.size() - 1;
		Card drawn = cards.get(topOfDeck);

		// remove card from deck
		cards.remove(topOfDeck);

		// give card to user
		return drawn;
	}

	/***
	 * add a card to the end of the list
	 * @param card
	 */
	public void feed(Card card) {
		cards.add(card);
	}
	
	/**
	 * shuffle the deck randomly
	 * the intensity will be how many iterations the deck will be shuffled
	 * @param intensity
	 */
	public void shuffle(int intensity) {
		
	}

	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public int getSize() {
		return cards.size();
	}
	
	
}
