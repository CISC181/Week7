package CISC181.Week7.ThreadNumberGuess;

public class cMain {

	public static void main(String[] args) {
		
		
		
		Thread r1 = new Thread(new GuessNumber('A',GuessNumber.RandomNumber()) );
		Thread r2 = new Thread(new GuessNumber('B',GuessNumber.RandomNumber()) );
		Thread r3 = new Thread(new GuessNumber('C',GuessNumber.RandomNumber()) );
		Thread r4 = new Thread(new GuessNumber('D',GuessNumber.RandomNumber()) );
		
		
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();

	}

}
