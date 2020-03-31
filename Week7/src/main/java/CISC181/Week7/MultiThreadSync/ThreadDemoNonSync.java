package CISC181.Week7.MultiThreadSync;

public class ThreadDemoNonSync extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemoNonSync( String name,  PrintDemo pd){
	       threadName = name;
	       PD = pd;
	   }
	   public void run() {

		 PD.printCount();
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}
