
public class Card {
static final int SPADES = 1;
static final int HEARTS = 2;
static final int DIAMONDS = 3;
static final int CLUBS = 4;
private int suit;
private int rank;

public Card(int suitIn, int rankIn) {
	suit = suitIn;
	rank = rankIn;
	
	
	
}
	public int getSuit() {
		
		return suit;
		
		
	}
	public int getRank() {
		
		return rank;
	}
}
