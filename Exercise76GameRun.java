
public class Exercise76GameRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		int roundCounter = 1;
		CardDeck crdDeck = new CardDeck();
		crdDeck.shuffle();
		crdDeck.printCardDeck();
		player1.start();
        player2.start();
	  while(crdDeck.moreCards()) {
		  
		   if(!(roundCounter%2 == 0)) {
			   player1.drawCard(crdDeck);
			   roundCounter++;
			   
		   }
		   else {
			   
			   player2.drawCard(crdDeck);
			   roundCounter++;
		   }
		   
		   
		   
	   }
		if(player1.getNbrSpades()>player2.getNbrSpades()) {
			System.out.println("Spelare 1 vann");
			
			
		}
		else {
		System.out.println("Spelare 2 vann");
			
			
		}

	}

}
