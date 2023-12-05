import java.util.Random;

public class CardDeck {
 private Card[] cardDeck = new Card[52];
 private Random rand = new Random();
 private int cardsDrwn = 0;
 
	public CardDeck() {
		int counter = 0;
	for(int i = 1 ;i<=4;i++) {
		
		for(int k = 1;k<=13;k++) {
			cardDeck[counter] = new Card(i,k);
			counter++;
			
			
			
		}
		
		
	}
	}
	int printCounter = 0;
	public void printCardDeck() {
		for(int i=0;i<52;i++) {
			Card crd = cardDeck[i];
			
			System.out.println(crd.getSuit()+ " "+crd.getRank()+" på plats "+printCounter);
			printCounter++;
			
		}
		
		
	}
		public void shuffle() {
			Card[] shuffleDeck = new Card[52];
			  for(int j = 0; j<52;j++) {
				  shuffleDeck[j] = new Card(0,0);
				  
				  
				  
			  }
			int counter = 0;
			int ordrNmbr = 0;
			Card crd = new Card(cardDeck[counter].getSuit(),cardDeck[counter].getSuit());
				while(counter<52) {
		        ordrNmbr = rand.nextInt(0,52);
				if(shuffleDeck[ordrNmbr].getSuit() == 0 ) {
					shuffleDeck[ordrNmbr] = new Card(crd.getSuit(),crd.getRank());
					counter ++;
					if(counter<52) {
					crd = new Card(cardDeck[counter].getSuit(),cardDeck[counter].getRank());
					}}
				
				
			}
				
				
			
			int cardCount =0;
			for(int m=0;m<52;m++) {
				this.cardDeck[m] = new Card(shuffleDeck[m].getSuit(),shuffleDeck[m].getRank());
				
			}
			
		 
	
	
	}
		public boolean moreCards() {
			boolean cardsLeft = cardsDrwn<52 ? true:false;
			return cardsLeft;
			
			
		}
		public Card drawCard() {
			Card returnCard = new Card(cardDeck[cardsDrwn].getSuit(),cardDeck[cardsDrwn].getRank());
			cardDeck[cardsDrwn] = new Card(10,10);
			cardsDrwn ++;
			
			return returnCard;
			
		}
}
