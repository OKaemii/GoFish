import java.util.ArrayList;

public class Player {
//	private final int HAND_LIMIT = 0;

	private String name = "";
	private ArrayList<Card> cards = new ArrayList<Card>();

	// constructor
	public Player() {
		this.name = "";
	}

	/**
	 * returns the top most card from a deck
	 * 
	 * @param deck deck to draw from
	 * @return true if successful
	 * @return false if too many in hand
	 */
	public boolean draw(Deck deck) {
//		if (HAND_LIMIT >=1 && cards.size() <= HAND_LIMIT) {
//			return false;
//		}
		cards.add(deck.draw());
		return true;
	}

	public void deck(Deck d, Card c) {
		d.feed(c);
	}

	public boolean findRank(Rank r) {
		for (Card c : cards) {
			System.out.println(Rank.values()[c.getRank()] + "checked with " + r); // debug
			if (Rank.values()[c.getRank()] == r) {
				return true;
			}
		}
		return false;
	}
	public boolean findSuit(Suit s) {
		for (Card c : cards) {
			System.out.println(Suit.values()[c.getSuit()] + "checked with " + s); // debug
			if (Suit.values()[c.getSuit()] == s) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public int getCardRank(Card c) {
		return c.getRank();
	}

	public int getCardSuit(Card s) {
		return s.getSuit();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
