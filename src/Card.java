
public class Card implements Comparable<Card>{
	private final Rank rank;
	private final Suit suit;
	//constructor
	public Card(int r, int s) {
	/*
	 * where rank is between [1,13]
	 * where suit is between [1,4]
	 */
		if (r > Rank.values().length || s > Suit.values().length) {
			r = s = 0;
		}
		this.rank = Rank.values()[r];
		this.suit = Suit.values()[s];
	}
	
	@Override
	public String toString() {
		return "Card: " + rank + " of " + suit;
	}
	//getters and setters

	public int getRank() {
		return rank.ordinal();
	}

	public int getSuit() {
		return suit.ordinal();
	}
	
	public boolean equals(Card that) {
	    return this.rank.getWeight() == that.rank.getWeight()
	        && this.suit.getWeight() == that.suit.getWeight();
	}
	
	@Override
	public int compareTo(Card that) {
		if (this.suit.getWeight() == that.suit.getWeight()) {
			if (this.rank == that.rank) {
				return 0;
			}else {
				return this.rank.getWeight() > that.rank.getWeight() ? 1 : -1;
			}
		}else {
			return this.suit.getWeight() > that.suit.getWeight() ? 1: -1;
		}
	}

}
