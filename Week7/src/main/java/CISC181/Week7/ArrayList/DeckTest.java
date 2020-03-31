package CISC181.Week7.ArrayList;

import java.util.Iterator;
import java.util.TreeSet;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println("size: " + d.getDeck().size());
		//	There is no capacity variable/method
		Iterator<Card> iterator = d.getDeck().iterator();
		// Displaying the Tree set data
		while (iterator.hasNext()) {
			Card c= iterator.next();			
			System.out.print(c.geteSuit() + " ");
			System.out.print(c.geteRank() + " ");
			System.out.println("");
		}
	
		
		System.out.println("######################################################");
		
		TreeSet<Card> RandomCards = new TreeSet<Card>();
		
		
		RandomCards.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		RandomCards.add(new Card(eSuit.HEARTS,eRank.ACE,0));
		RandomCards.add(new Card(eSuit.SPADES,eRank.ACE,0));
		RandomCards.add(new Card(eSuit.SPADES,eRank.SIX,0));		
		RandomCards.add(new Card(eSuit.DIAMONDS,eRank.JACK,0));
		RandomCards.add(new Card(eSuit.CLUBS,eRank.TWO,0));
		RandomCards.add(new Card(eSuit.CLUBS,eRank.ACE,0));		
		
		Iterator<Card> it = RandomCards.iterator();
		// Displaying the Tree set data
		while (it.hasNext()) {
			Card c= it.next();			
			System.out.print(c.geteSuit() + " ");
			System.out.print(c.geteRank() + " ");
			System.out.println("");
		}
	}

}
