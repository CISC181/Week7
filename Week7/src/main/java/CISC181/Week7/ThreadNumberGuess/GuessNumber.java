package CISC181.Week7.ThreadNumberGuess;

public class GuessNumber  implements Runnable {

	private char iGuessName;
	private int iNumber;
	
	
	public GuessNumber(char iGuessName, int num)
	{
		this.iGuessName = iGuessName;
		this.iNumber = num;
	}
	
	
	@Override
	public void run() {
		
 
		int iGuessNbr = 0;
		while (true)
		{
			int iGuess = GuessNumber.RandomNumber();

			//System.out.println(iGuess);
			
			if (iNumber == GuessNumber.RandomNumber())
			{
				break;
			}	
			iGuessNbr++;
			
			
		}
		System.out.println("Number is guessed");
		System.out.println("Guess Name: " + iGuessName + " Guesses: " + iGuessNbr);
	}
	
	public static int RandomNumber()
	{
		int min = 1;  
		int max = 1000000;  
		  
		return  (int) (Math.random()*(max-min+1)+min);  
	}

}
