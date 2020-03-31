package CISC181.Week7.ArrayList;

import java.io.Serializable;
import java.util.Comparator;

public class Card implements Comparable, Serializable {

	private eSuit eSuit;

	private eRank eRank;
	private int iCardNbr;
	private boolean bWild;

	public Card(eSuit eSuit, eRank eRank, int iCardNbr) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNbr = iCardNbr;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}

	public int getiCardNbr() {
		return iCardNbr;
	}

	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public boolean isbWild() {
		return bWild;
	}

	void setbWild(boolean bWild) {
		this.bWild = bWild;
	}

	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

			return c1.getiCardNbr() - c2.getiCardNbr();
			/*
			 * int Cno1 = c1.geteRank().getiRankNbr(); int Cno2 =
			 * c2.geteRank().getiRankNbr();
			 * 
			 * 
			 * if (Cno2 - Cno1 > 0) { return Cno2 - Cno1; }
			 * 
			 * return c1.geteSuit().getiSuitNbr() - c2.geteSuit().getiSuitNbr();
			 */
		}
	};



	@Override
	public int compareTo(Object o) {
		Card c = (Card)o;
		int i = this.geteSuit().compareTo(c.geteSuit());
		if (i != 0)
			return i;
		i = this.geteRank().compareTo(c.geteRank());

		return i;
	}

}
