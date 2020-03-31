package CISC181.Week7.MultiThreadSync;

public class TestThreadNonSync {
	   public static void main(String args[]) {

	      PrintDemo PD = new PrintDemo();

	      ThreadDemoNonSync T1 = new ThreadDemoNonSync( "Thread - 1 ", PD );
	      ThreadDemoNonSync T2 = new ThreadDemoNonSync( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	    	 System.out.println("Waiting for t1 to join");
	         T1.join();
	         System.out.println("Waiting for t2 to join");
	         T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	      System.out.println("Both Threads Done");
	   }
	}

