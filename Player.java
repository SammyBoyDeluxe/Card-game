
public class Player {
	
	private int playerNbr;
	private int nbrSpades;
	
	public Player(int nbr) {
		
		playerNbr = nbr;
		
	}
	
	public void start() {
		
		nbrSpades = 0;
		
	}
	
	public void drawCard(CardDeck crdDeck) {
		Card cardDrwn = crdDeck.drawCard();
		
		if(cardDrwn.getSuit() == 2) {
			cardDrwn = crdDeck.drawCard();
			if(cardDrwn.getSuit() == 1) {
				nbrSpades++;
				
				
			}
			
			
		}
		else if(cardDrwn.getSuit() == 1) {
			nbrSpades++;
			
			
			
			
		}
		
		
		
		
	}
public int getNbr() {
	return playerNbr;
	
	
	
}
public int getNbrSpades() {
	
	return nbrSpades;
	
}
}

