package CISC181.Week7.Vector;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;


public class Deck implements Serializable {

	private Vector<Card> deckCards = new Vector<Card>(1);

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eSuit != eSuit.JOKER) && (eRank != eRank.JOKER)) {
					//System.out.println(iCardNbr);
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
		}
		Collections.shuffle(deckCards);

	}


	public Card Draw() {
		return deckCards.remove(0);
	}

	public Vector<Card> getDeck() {
		return deckCards;
	}
}
