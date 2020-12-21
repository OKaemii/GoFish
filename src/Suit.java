public enum Suit {
	CLUBS(1),DIAMONDS(2),HEARTS(3),SPADES(4);
	private final int weight;
	Suit(int weight){
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
